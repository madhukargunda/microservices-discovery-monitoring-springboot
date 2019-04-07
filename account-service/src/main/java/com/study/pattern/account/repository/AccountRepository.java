package com.study.pattern.account.repository;

import java.util.List;

import com.study.pattern.account.model.Account;

public interface AccountRepository  {

    public Account findByNumber(String number);
    public List<Account> findByCustomerId(String customerId);
}
