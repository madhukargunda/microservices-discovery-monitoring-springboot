package com.study.pattern.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.study.pattern.account.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    @Query("SELECT a from Account a WHERE a.account_number = :accountNumber")
    public Account findByAccountNumber(String accountNumber);

    @Query("SELECT * from Account a WHERE a.customer_id = :customerId")
    public List<Account> findByCustomerId(String customerId);

}
