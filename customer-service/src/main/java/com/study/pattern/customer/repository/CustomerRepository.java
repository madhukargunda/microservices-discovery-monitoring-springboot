package com.study.pattern.customer.repository;

import java.util.List;

import com.study.pattern.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT DISTINCT c from Customer c WHERE c.customer_id = :customerId")
    public Customer findByCustomerId(@Param("customerId") String customerId);

    @Query("SELECT c from Customer c WHERE c.name = :name")
    public Customer findByCustomerName(@Param("name") String name);

}
