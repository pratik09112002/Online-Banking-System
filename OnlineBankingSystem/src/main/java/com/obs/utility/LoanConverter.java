package com.obs.utility;

import org.springframework.beans.BeanUtils;

import com.obs.entities.Loan;
import com.obs.model.LoanDTO;


public class LoanConverter 
{
	public Loan convertToLoanEntity(LoanDTO loanDTO)
	{
		Loan loan=new Loan();
		if(loanDTO != null)
		{
			BeanUtils.copyProperties(loanDTO, loan);
		}

		return loan;
	}
	
	public LoanDTO convertLoanDTO(Loan loan)
	{
		LoanDTO loanDTO = new LoanDTO();
		if(loan != null)
		{
			BeanUtils.copyProperties(loan, loanDTO);
		}
		
		return loanDTO;
	}

}
