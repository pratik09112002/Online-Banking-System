package com.obs.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Loan 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Amount", length = 20)
    private double amount;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "StartDate", length = 20)
    private Date startDate;     	// ensures that only the date portion of the date-time value is stored 
									// in the corresponding database column, without any time information
	
	@Temporal(TemporalType.DATE)
	@Column(name = "EndDate", length = 20)
    private Date endDate;
	
	@Column(name = "InterestRate", length = 20)
    private double interestRate;	
	
	@Column(name = "BorrowerName")
    private String borrowerName;

    @Column(name = "BorrowerEmail")
    private String borrowerEmail;

    @Column(name = "LoanType")
    private String loanType;

    @Column(name = "LoanOfficer")
    private String loanOfficer;

    @Column(name = "LoanStatus")
    private String loanStatus; 			// e.g., "pending", "approved", "rejected"


}
