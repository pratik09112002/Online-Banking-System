package com.obs.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO 
{
	private int id;						
    private String firstName;			
    private String lastName;			
    private Date joinDate;				
    private String department;       		
	private BigDecimal salary;				
	private String emailId;				
    private String phoneNumber; 		
    private String add; 				
	private String gender;				

}
