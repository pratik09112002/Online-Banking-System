package com.obs.service;

import java.util.List;

import com.obs.entities.Transaction;
import com.obs.model.TransactionDTO;

public interface TransactionService 
{
	TransactionDTO createTransaction (Transaction transaction);
	List<TransactionDTO> getAllTransactions();
	TransactionDTO getTransactionById(int id);
	String deleteTransactionById(int id);
	//TransactionDTO updateTransaction(int id, Transaction transaction);

}
