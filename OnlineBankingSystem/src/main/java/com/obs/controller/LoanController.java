package com.obs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.obs.entities.Loan;
import com.obs.model.LoanDTO;
import com.obs.service.LoanService;
import com.obs.utility.LoanConverter;

public class LoanController 
{
	@Autowired
	LoanService loanService;
	
	@Autowired
	LoanConverter loanConverter;
	

	@PostMapping("/createLoan")
	ResponseEntity<LoanDTO> createLoan(@RequestBody LoanDTO loanDTO)
	{
		final Loan loan = loanConverter.convertToLoanEntity(loanDTO);
		return new ResponseEntity<LoanDTO>(loanService.createLoan(loan),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllLoan")
	List<LoanDTO> getAllLoan()
	{
		return loanService.getAllLoans();
		
	}
	
	@GetMapping("/getLoanById/{cus_id}")
	LoanDTO getLoanById(@PathVariable("cus_id") int id)
	{
		return loanService.getLoanById(id);
		
	}
	
//	@DeleteMapping("/deleteLoan/{cus_id}")
//	String deleteLoanById(@PathVariable("cus_id") int id)
//	{
//		return loanService.deleteLoanById(id);
//		
//	}
//	
	@PutMapping("/updateLoan/{cus_id}")
	LoanDTO updateLoan(@PathVariable("cus_id") int id, @RequestBody Loan loan)
	{
		return loanService.updateLoan(id, loan);
		
	}


}
