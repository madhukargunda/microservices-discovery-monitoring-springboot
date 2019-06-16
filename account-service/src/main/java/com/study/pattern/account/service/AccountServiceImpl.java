package com.study.pattern.account.service;

import com.study.pattern.account.model.Account;
import com.study.pattern.account.repository.AccountRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class AccountServiceImpl {

    @Resource
    AccountRepository accountRepository;

    ArrayList<Account> findAll(){
        return (ArrayList<Account>) accountRepository.findAll();
    }

    Account findByAccountNumber(String accountNumber){
        return accountRepository.findByAccountNumber(accountNumber);
    }

    ArrayList<Account> findByCustomerId(String customerId){
        return (ArrayList<Account>) accountRepository.findByCustomerId(customerId);
    }

    Account createAccount(Account account){
        return accountRepository.saveAndFlush(account);
    }

    Account updateAccount(Account account){
        return accountRepository.saveAndFlush(account);
    }

    void deleteAccount(String accountNumber){
        Account account = accountRepository.findByAccountNumber(accountNumber);
        accountRepository.delete(account);
    }
}
