package com.study.pattern.customer.controller;

import java.net.URI;
import java.util.List;

import com.study.pattern.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.study.pattern.customer.model.Customer;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Slf4j
@RestController
@RequestMapping("customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/{customerId}")
	public Customer findByCustomerId(@PathVariable("customerId") String customerId) {
		log.info("Getting Customer with Customer ID: {}", customerId);
		return customerService.findByCustomerId(customerId);
	}
	
	@GetMapping("/")
	public List<Customer> findAll() {
		log.info("Finding all Customers");
		return customerService.findAll();
	}

	@PostMapping("/")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
		Customer createdCustomer = customerService.createCustomer(customer);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdCustomer.getCustomerId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping("/{customerId}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		Customer updatedCustomer = customerService.updateCustomer(customer);
		return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
	}

	@DeleteMapping("/{customerId}")
	public ResponseEntity<Void> deleteCustomer(@PathVariable("customerId") String customerId){
		customerService.deleteCustomer(customerId);
		return ResponseEntity.noContent().build();
	}

}
