package com.study.pattern.customer.service;

import com.study.pattern.customer.model.Customer;
import com.study.pattern.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerRepository customerRepository;

    @Override

    public ArrayList<Customer> findAll() {
        return (ArrayList<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer findByCustomerName(String customerName) {
        return customerRepository.findByCustomerName(customerName);
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