package com.obs.utility;

import org.springframework.beans.BeanUtils;

import com.obs.entities.Transaction;
import com.obs.model.TransactionDTO;

public class TransactionConverter 
{
	public Transaction convertToTransactionEntity(TransactionDTO transactionDTO)
	{
		Transaction transaction=new Transaction();
		if(transactionDTO != null)
		{
			BeanUtils.copyProperties(transactionDTO, transaction);
		}

		return transaction;
	}
	
	public TransactionDTO convertTransactionDTO(Transaction transaction)
	{
		TransactionDTO transactionDTO = new TransactionDTO();
		if(transaction != null)
		{
			BeanUtils.copyProperties(transaction, transactionDTO);
		}
		
		return transactionDTO;
	}

}
