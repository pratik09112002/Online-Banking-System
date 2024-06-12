package com.obs.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obs.entities.CreditCard;
import com.obs.model.CreditCardDTO;
import com.obs.repository.CreditCardRepository;
import com.obs.service.CreditCardService;
import com.obs.utility.CreditCardConverter;

@Service
public class CreditCardServiceImpl implements CreditCardService
{
	
	@Autowired
	CreditCardRepository creditCardRepository;
	
	@Autowired
	CreditCardConverter creditCardConverter;
	

	@Override
	public CreditCardDTO createCreditCard(CreditCard creditcard) 
	{
		// TODO Auto-generated method stub
		CreditCard card = creditCardRepository.save(creditcard);
		
		return creditCardConverter.convertToCreditCardDTO(card);
	}

	@Override
	public List<CreditCardDTO> getAllCreditCards() 
	{
		// TODO Auto-generated method stub
		
		List<CreditCard> creditcards = creditCardRepository.findAll();
		List<CreditCardDTO> dtocard = new ArrayList<>();
		for(CreditCard card : creditcards)
		{
			dtocard.add(creditCardConverter.convertToCreditCardDTO(card));
		}
		return dtocard;
		
	}

	@Override
	public CreditCardDTO getCreditCardById(int id) 
	{
		// TODO Auto-generated method stub
		
		CreditCard card = creditCardRepository.findById(id).get();
		return creditCardConverter.convertToCreditCardDTO(card);
	}

	@Override
	public String deleteCreditCardById(int id) 
	{
		// TODO Auto-generated method stub
		creditCardRepository.deleteById(id);
		return "Credit Card Deleted";
	}

//	@Override
//	public CreditCardDTO updateCreditCard(int id, CreditCard creditCard) 
//	{
//		// TODO Auto-generated method stub
//		
//		CreditCard card=creditCardRepository.findById(id).get();
//		card.setCardHolderName(creditCard.getCardHolderName());
//		card.setCardNumber(creditCard.getCardNumber());
//		card.setCvv(creditCard.getCvv());
//		card.setExpirationDate(creditCard.getExpirationDate());
//		card.setBalance(creditCard.getBalance());
//		
//		CreditCard c = creditCardRepository.save(creditCard);
//		
//		return creditCardConverter.convertToCreditCardDTO(c);
//	}
//	

}
