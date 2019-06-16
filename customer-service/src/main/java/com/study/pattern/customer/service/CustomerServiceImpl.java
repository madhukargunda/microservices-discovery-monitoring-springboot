package com.study.pattern.customer.service;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.study.pattern.customer.model.Customer;
import com.study.pattern.customer.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerRepository customerRepository;

    @Override

    public ArrayList<Customer> findAll() {
    	log.info("Invoking findAll method");
        return (ArrayList<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer findByCustomerName(String name) {
    	log.info("Invoking findByCustomerName for name {}",name);
        return customerRepository.findByName(name);
    }

    @Override
    public Customer findByCustomerId(String customerId) {
        return customerRepository.findByCustomerId(customerId);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    @Override
    public void deleteCustomer(String id) {
        Customer customer = customerRepository.findByCustomerId(id);
        customerRepository.delete(customer);
    }

}