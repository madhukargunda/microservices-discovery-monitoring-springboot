package com.study.pattern.customer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.study.pattern.customer.model.Customer;
import com.study.pattern.customer.model.CustomerType;

@RestController
public class CustomerController {
	
	
	protected Logger logger = Logger.getLogger(CustomerController.class.getName());
	
	private List<Customer> customers;
	
	public CustomerController() {
		customers = new ArrayList<>();
		customers.add(new Customer(1, "12345", "Adam Kowalski", CustomerType.INDIVIDUAL));
		customers.add(new Customer(2, "12346", "Anna Malinowska", CustomerType.INDIVIDUAL));
		customers.add(new Customer(3, "12347", "Paweł Michalski", CustomerType.INDIVIDUAL));
		customers.add(new Customer(4, "12348", "Karolina Lewandowska", CustomerType.INDIVIDUAL));
	}
	
	@GetMapping("/customers/pesel/{pesel}")
	public Customer findByPesel(@PathVariable("pesel") String pesel) {
		logger.info(String.format("Customer.findByPesel(%s)", pesel));
		return customers.stream().filter(it -> it.getPesel().equals(pesel)).findFirst().get();	
	}
	
	@GetMapping("/customers")
	public List<Customer> findAll() {
		logger.info("Customer.findAll()");
		return customers;
	}
}
