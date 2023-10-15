package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

@RestController
public class AccountController {
	@Autowired
	private AccountRepository accountRepository;

	@PostMapping("/add")
	public Account addAccount(@RequestBody Account account) {
		return accountRepository.save(account);
	}
}
