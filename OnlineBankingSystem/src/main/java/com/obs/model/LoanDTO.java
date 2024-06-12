package com.obs.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LoanDTO
{
	private int id;
    private double amount;
    private Date startDate;     	
    private Date endDate;

    private double interestRate;	
    private String borrowerName;
    private String borrowerEmail;
    private String loanType;
    private String loanOfficer;
    private String loanStatus; 
}
