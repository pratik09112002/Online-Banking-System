package com.obs.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customer_details")
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customerId",length =20)
	private int Id;
	
	@Column(name="FirstName",length =30)
	private String firstName;
	
	@Column(name="LastName",length =30)
	private String lastName;
	
	@Column(name="customerAdd",length =70)
	private String address;
	
	@Column(name="customerPHno",length =10)
	private String phNo;
	
	@Column(name="customerAge", length=3)
	private int age;
	
	@Column(name="Gender", length=15)
	private String customerGender;
	
	@Column(name = "AaddharNo", length = 12)
	private String addharNo;
	
}
