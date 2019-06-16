package com.study.pattern.customer.service;

import com.study.pattern.customer.model.Customer;

import java.util.ArrayList;

public interface CustomerService {

    ArrayList<Customer> findAll();

    Customer findByCustomerName(String customerName);

    Customer findByCustomerId(String customerId);

    Customer createCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(String id);

}