package com.study.pattern.account.controller;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.study.pattern.account.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.pattern.account.dto.AccountResponse;
import com.study.pattern.account.model.Account;
import com.study.pattern.account.repository.AccountRepository;

@Slf4j
@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping("{number}")
	public AccountResponse<Account> findByNumber(@PathVariable("number") String number) {
		log.info(String.format("Account.findByNumber(%s)", number));
		return new AccountResponse<>(accountService.findByAccountNumber(number));
	}
	
	@GetMapping("customers/{customer}")
	public AccountResponse<List<Account>> findByCustomer(@PathVariable("customer") String customerId) {
		log.info(String.format("Account.findByCustomer(%s)", customerId));
		return new AccountResponse<>(accountService.findByCustomerId(customerId));
	}
	
	@GetMapping("")
	public  AccountResponse<List<Account>> findAll() {
		log.info("Account.findAll()");
		return new AccountResponse<>(accountService.findAll());
	}
	
}
