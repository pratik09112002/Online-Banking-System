package com.obs.utility;

import org.springframework.beans.BeanUtils;

import com.obs.entities.CreditCard;
import com.obs.model.CreditCardDTO;

public class CreditCardConverter 
{
	public CreditCard convertToCreditCardEntity(CreditCardDTO creditCardDTO)
	{
		CreditCard creditCard=new CreditCard();
		if(creditCardDTO != null)
		{
			BeanUtils.copyProperties(creditCardDTO, creditCard);
		}

		return creditCard;
	}
	
	public CreditCardDTO convertToCreditCardDTO(CreditCard creditCard)
	{
		CreditCardDTO creditCardDTO = new CreditCardDTO();
		if(creditCard != null)
		{
			BeanUtils.copyProperties(creditCard, creditCardDTO);
		}
		
		return creditCardDTO;
	}

}
