package com.obs.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CreditCardDTO 
{
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private int cvv;
    private BigDecimal balance;

}
