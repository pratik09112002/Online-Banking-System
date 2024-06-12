package com.obs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.obs.entities.Account;
import com.obs.model.AccountDTO;
import com.obs.service.AccountService;
import com.obs.utility.AccountConverter;

public class AccountController 
{
	@Autowired
	AccountService accountService;
	
	@Autowired
	AccountConverter accountConverter;
	
	@PostMapping("/createAccount")
	ResponseEntity<AccountDTO> createAccount(@RequestBody AccountDTO accountDTO)
	{
		final Account account = accountConverter.convertToAccountEntity(accountDTO);
		return new ResponseEntity<AccountDTO>(accountService.createAccount(account),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllaccount")
	List<AccountDTO> getAllaccount()
	{
		return accountService.getAllAccounts();
		
	}
	
	@GetMapping("/getAccountById/{cus_id}")
	AccountDTO getAccountById(@PathVariable("cus_id") int id)
	{
		return accountService.getAccountById(id);
		
	}
	
	@DeleteMapping("/deleteAccount/{cus_id}")
	String deleteAccountById(@PathVariable("cus_id") int id)
	{
		return accountService.deleteAccountById(id);
		
	}
	
	@PutMapping("/updateAccount/{cus_id}")
	AccountDTO updateAccount(@PathVariable("cus_id") int id, @RequestBody Account account)
	{
		return accountService.updateAccount(id, account);
		
	}


}
