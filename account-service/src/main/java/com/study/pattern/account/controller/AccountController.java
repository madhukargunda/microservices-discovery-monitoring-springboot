package com.study.pattern.account.controller;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.pattern.account.dto.AccountResponse;
import com.study.pattern.account.model.Account;
import com.study.pattern.account.repository.AccountRepository;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	protected Logger logger = Logger.getLogger(AccountController.class.getName());
	
	
	@GetMapping("{number}")
	public AccountResponse<Account> findByNumber(@PathVariable("number") String number) {
		logger.info(String.format("Account.findByNumber(%s)", number));
		return new AccountResponse<Account>(accountRepository.findAll().stream().filter(it -> it.getAccountNumber().equals(number)).findFirst().orElse(null));
	}
	
	@GetMapping("customer/{customer}")
	public AccountResponse<List<Account>> findByCustomer(@PathVariable("customer") Integer customerId) {
		logger.info(String.format("Account.findByCustomer(%s)", customerId));
		return new AccountResponse<List<Account>>(accountRepository.findAll().stream().filter(it -> it.getCustomerId().intValue()==customerId.intValue()).collect(Collectors.toList()));
	}
	
	@GetMapping("")
	public  AccountResponse<List<Account>> findAll() {
		logger.info("Account.findAll()");
		return new AccountResponse<List<Account>>(accountRepository.findAll());
	}
	
}
