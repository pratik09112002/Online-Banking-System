package com.obs.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obs.entities.Transaction;
import com.obs.model.TransactionDTO;
import com.obs.repository.TransactionRepository;
import com.obs.service.TransactionService;
import com.obs.utility.TransactionConverter;

@Service
public class TransactionServiceImpl implements TransactionService
{
	@Autowired
	TransactionRepository transactionRepository;
	
	@Autowired
	TransactionConverter transactionConverter;

	@Override
	public TransactionDTO createTransaction(Transaction transaction) 
	{
		// TODO Auto-generated method stub
		
		Transaction t = transactionRepository.save(transaction);
		return transactionConverter.convertTransactionDTO(t);
	}

	@Override
	public List<TransactionDTO> getAllTransactions() 
	{
		// TODO Auto-generated method stub
		List<Transaction> t1 = transactionRepository.findAll();
		List<TransactionDTO> dtot = new ArrayList<>();
		for(Transaction t : t1)
		{
			dtot.add(transactionConverter.convertTransactionDTO(t));
		}
		return dtot;
	}

	@Override
	public TransactionDTO getTransactionById(int id) 
	{
		// TODO Auto-generated method stub
		
		Transaction t1 = transactionRepository.findById(id).get();
		return transactionConverter.convertTransactionDTO(t1);
	}

	@Override
	public String deleteTransactionById(int id) 
	{
		// TODO Auto-generated method stub
		transactionRepository.deleteById(id);

		return "Transaction deleted";
	}

//	@Override
//	public TransactionDTO updateTransaction(int id, Transaction transaction) 
//	{
//		// TODO Auto-generated method stub
//		Transaction t1=transactionRepository.findById(id).get();
//		
//		t1.setPayeeName(transaction.getPayeeName());
//		t1.setPayerName(transaction.getPayerName());
//		t1.setAmount(transaction.getAmount());
//		t1.setDescription(transaction.getDescription());
//		t1.setTransactionDateTime(transaction.getTransactionDateTime());
//		t1.setTransactionType(transaction.getTransactionType());
//
//		Transaction t = transactionRepository.save(t1);
//		
//		return transactionConverter.convertTransactionDTO(t);
//	}
//	
}
