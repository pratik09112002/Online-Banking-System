package com.obs.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDTO 
{
	 private int id;
	 private String accountNumber;
	 private double balance;
	 private String accountHolderName;
	 private String accountType;
	 private LocalDateTime dateCreated;
	 private String status;

}
