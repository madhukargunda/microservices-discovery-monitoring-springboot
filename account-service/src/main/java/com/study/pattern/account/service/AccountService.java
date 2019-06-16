package com.study.pattern.account.service;

import com.study.pattern.account.model.Account;

import java.util.ArrayList;

public interface AccountService {

    ArrayList<Account> findAll();

    Account findByAccountNumber(String accountNumber);

    ArrayList<Account> findByCustomerId(String customerId);

    Account createAccount(Account account);

    Account updateAccount(Account account);

    void deleteAccount(String id);

}
