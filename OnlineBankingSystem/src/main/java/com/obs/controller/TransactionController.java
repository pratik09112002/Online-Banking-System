package com.obs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.obs.entities.Transaction;
import com.obs.model.TransactionDTO;
import com.obs.service.TransactionService;
import com.obs.utility.TransactionConverter;

public class TransactionController 
{
	@Autowired
	TransactionService transactionService;
	
	@Autowired
	TransactionConverter transactionConverter;
	

	@PostMapping("/createTransaction")
	ResponseEntity<TransactionDTO> createTransaction(@RequestBody TransactionDTO transactionDTO)
	{
		final Transaction transaction = transactionConverter.convertToTransactionEntity(transactionDTO);
		return new ResponseEntity<TransactionDTO>(transactionService.createTransaction(transaction),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllTransaction")
	List<TransactionDTO> getAllTransaction()
	{
		return transactionService.getAllTransactions();
		
		
	}
	
	@GetMapping("/getTransactionById/{cus_id}")
	TransactionDTO getTransactionById(@PathVariable("cus_id") int id)
	{
		return transactionService.getTransactionById(id);
		
	}
	
	@DeleteMapping("/deleteTransaction/{cus_id}")
	String deleteTransactionById(@PathVariable("cus_id") int id)
	{
		return transactionService.deleteTransactionById(id);
		
	}
	
//	@PutMapping("/updateTransaction/{cus_id}")
//	TransactionDTO updateTransaction(@PathVariable("cus_id") int id, @RequestBody Transaction transaction)
//	{
//		return transactionService.updateTransaction(id, transaction);
//		
//	}


	

}
