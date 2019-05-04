package com.study.pattern.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.pattern.account.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    public Account findByAccountNumber(String accountNumber);

    public List<Account> findByCustomerId(String customerId);

}
