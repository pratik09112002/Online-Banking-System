package com.obs.service;

import java.util.List;

import com.obs.entities.Loan;
import com.obs.model.LoanDTO;

public interface LoanService 
{
	LoanDTO createLoan (Loan loan);
	List<LoanDTO> getAllLoans();
	LoanDTO getLoanById(int id);
	//String deleteLoanById(int id);
	LoanDTO updateLoan(int id, Loan loan);
}
