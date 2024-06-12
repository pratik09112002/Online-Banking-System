package com.obs.entities;

import java.math.BigDecimal;
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
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EmployeeID", length = 20)
	private int id;						// Employee's Id
	
	@Column(name = "FirstName", length = 20)
    private String firstName;			// Employee's First name
	
	@Column(name = "LastName", length = 20)
    private String lastName;			// Employee's Last name
	
	@Temporal(TemporalType.DATE)
	@Column(name = "JoinDate", length = 11)
    private Date joinDate;				//  Date when the employee joined the company
	
	@Column(name = "Department", length = 25)
    private String department;       	// Employee's department
	
	 @Column(name = "Salary", precision = 10, scale = 2)
	 private BigDecimal salary;				// Employee's Salary
	
	@Column(name = "Email", length = 30)
	private String emailId;				// Employee's emailId
	
	@Column(name = "PhoneNumber", length = 10)
    private String phoneNumber; 		// Employee's phone number
	
	@Column(name = "EmployeeAddress", length = 60)
    private String add; 				// Employee's phone number
	
	@Column(name = "Gender", length = 20)
	private String gender;				// Employee's Gender


	
}

