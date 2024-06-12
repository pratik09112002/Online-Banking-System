package com.obs.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obs.entities.Account;
import com.obs.model.AccountDTO;
import com.obs.repository.AccountRepository;
import com.obs.service.AccountService;
import com.obs.utility.AccountConverter;

@Service
public class AccountServiceImpl implements AccountService
{
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	AccountConverter accountConverter;

	@Override
	public AccountDTO createAccount(Account account)
	{
		Account acc = accountRepository.save(account);
		return accountConverter.convertToAccountDTO(acc);
	}

	@Override
	public List<AccountDTO> getAllAccounts() 
	{
		// TODO Auto-generated method stub
		List<Account> accounts=accountRepository.findAll();
		List<AccountDTO> dtoa = new ArrayList<>();
		for(Account a : accounts)
		{
			dtoa.add(accountConverter.convertToAccountDTO(a));
		}
		return dtoa;
	}

	@Override
	public AccountDTO getAccountById(int id) 
	{
		// TODO Auto-generated method stub
		
		Account a = accountRepository.findById(id).get();
		return accountConverter.convertToAccountDTO(a);
	}

	@Override
	public String deleteAccountById(int id)
	{
		// TODO Auto-generated method stub
		
		accountRepository.deleteById(id);
		return "Account Deleted";
	}

	@Override
	public AccountDTO updateAccount(int id, Account account) 
	{
		// TODO Auto-generated method stub
		
		Account a1= accountRepository.findById(id).get();
		a1.setAccountHolderName(account.getAccountHolderName());
		a1.setAccountNumber(account.getAccountNumber());
		a1.setAccountType(account.getAccountType());
		a1.setBalance(account.getBalance());
		a1.setDateCreated(account.getDateCreated());
		a1.setStatus(account.getStatus());

		Account acc = accountRepository.save(a1);
		return accountConverter.convertToAccountDTO(acc);
		
	}
	
	
}
