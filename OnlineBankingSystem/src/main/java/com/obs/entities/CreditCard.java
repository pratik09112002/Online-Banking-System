package com.obs.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CreditCard")


public class CreditCard 
{
	@Column(name = "CardNumber", length = 20)
    private String cardNumber;
	
	@Column(name = "CardHolderName", length = 50)
    private String cardHolderName;
	
	@Column(name = "ExpiryDate", length = 11)
    private String expirationDate;
	
	@Column(name = "CVV", length = 4)
    private int cvv;
	
	@Column(name = "Balance", precision = 10, scale = 2)
    private BigDecimal balance;
	
}
