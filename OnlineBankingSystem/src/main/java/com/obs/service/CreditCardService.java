package com.obs.service;

import java.util.List;

import com.obs.entities.CreditCard;
import com.obs.model.CreditCardDTO;

public interface CreditCardService 
{
	CreditCardDTO createCreditCard (CreditCard creditcard);
	List<CreditCardDTO> getAllCreditCards();
	CreditCardDTO getCreditCardById(int id);
	String deleteCreditCardById(int id);
	//CreditCardDTO updateCreditCard(int id, CreditCard creditCard); 

}
