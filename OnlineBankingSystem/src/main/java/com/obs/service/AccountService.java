package com.obs.service;

import java.util.List;

import com.obs.entities.Account;
import com.obs.model.AccountDTO;

public interface AccountService 
{
	AccountDTO createAccount(Account account); 
	List<AccountDTO> getAllAccounts();
	AccountDTO getAccountById(int id);
	String deleteAccountById(int id);
	AccountDTO updateAccount(int id, Account account);
}
