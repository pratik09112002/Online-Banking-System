package com.obs.utility;

import org.springframework.beans.BeanUtils;

import com.obs.entities.Account;
import com.obs.model.AccountDTO;


public class AccountConverter 
{
	public Account convertToAccountEntity(AccountDTO accountDTO)
	{
		Account account=new Account();
		if(accountDTO != null)
		{
			BeanUtils.copyProperties(accountDTO, account);
		}

		return account;
	}
	
	public AccountDTO convertToAccountDTO(Account account)
	{
		AccountDTO accountDTO = new AccountDTO();
		if(account != null)
		{
			BeanUtils.copyProperties(account, accountDTO);
		}
		
		return accountDTO;
	}

}


