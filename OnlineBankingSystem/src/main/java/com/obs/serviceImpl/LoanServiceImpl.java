package com.obs.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obs.entities.Loan;
import com.obs.model.LoanDTO;
import com.obs.repository.LoanRepository;
import com.obs.service.LoanService;
import com.obs.utility.LoanConverter;

@Service
public class LoanServiceImpl implements LoanService
{
	@Autowired
	LoanRepository loanRepository;
	
	@Autowired
	LoanConverter loanConverter;

	@Override
	public LoanDTO createLoan(Loan loan) 
	{
		// TODO Auto-generated method stub
		
		Loan l1 = loanRepository.save(loan);
		
		return loanConverter.convertLoanDTO(l1);
	}

	@Override
	public List<LoanDTO> getAllLoans() 
	{
		// TODO Auto-generated method stub
		List<Loan> loans = loanRepository.findAll();
		List<LoanDTO> dtol = new ArrayList<>();
		for (Loan l1 : loans)
		{
			dtol.add(loanConverter.convertLoanDTO(l1));
		}
		return dtol;
	}

	@Override
	public LoanDTO getLoanById(int id) 
	{
		// TODO Auto-generated method stub
		Loan l1 =  loanRepository.findById(id).get();
		
		return loanConverter.convertLoanDTO(l1);
	}

//	@Override
//	public String deleteLoanById(int id) 
//	{
//		// TODO Auto-generated method stub
//		loanRepository.deleteById(id); 
//		return "Loan Deleted";
//	}

	@Override
	public LoanDTO updateLoan(int id, Loan loan) 
	{
		// TODO Auto-generated method stub
		Loan l1=loanRepository.findById(id).get();
		
		l1.setBorrowerName(loan.getBorrowerName());
		l1.setBorrowerEmail(loan.getBorrowerEmail());
		l1.setLoanOfficer(loan.getLoanOfficer());
		l1.setLoanStatus(loan.getLoanStatus());
		l1.setAmount(loan.getAmount());
		l1.setStartDate(loan.getStartDate());
		l1.setInterestRate(loan.getInterestRate());
		l1.setLoanStatus(loan.getLoanStatus());
		l1.setLoanType(loan.getLoanType());

		Loan loan1 = loanRepository.save(l1);
		
		return loanConverter.convertLoanDTO(loan1);
	}

	
}
