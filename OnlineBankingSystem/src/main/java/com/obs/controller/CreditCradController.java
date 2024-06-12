package com.obs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.obs.entities.CreditCard;
import com.obs.model.CreditCardDTO;
import com.obs.service.CreditCardService;
import com.obs.utility.CreditCardConverter;

public class CreditCradController 
{
	@Autowired
	CreditCardService creditCardService;
	
	@Autowired
	CreditCardConverter creditcardConverter;
	
	@PostMapping("/createCreditCard")
	ResponseEntity<CreditCardDTO> createCreditCard(@RequestBody CreditCardDTO creditCardDTO)
	{
		final CreditCard creditCard = creditcardConverter.convertToCreditCardEntity(creditCardDTO);
		return new ResponseEntity<CreditCardDTO>(creditCardService.createCreditCard(creditCard),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllCreditCard")
	List<CreditCardDTO> getAllCreditCard()
	{
		return creditCardService.getAllCreditCards();
		
	}
	
	@GetMapping("/getCreditCardById/{cus_id}")
	CreditCardDTO getCreditCardById(@PathVariable("cus_id") int id)
	{
		return creditCardService.getCreditCardById(id);
		
	}
	
	@DeleteMapping("/deleteCreditCard/{cus_id}")
	String deleteCreditCardById(@PathVariable("cus_id") int id)
	{
		return creditCardService.deleteCreditCardById(id);
		
	}
	
//	@PutMapping("/updateCreditCard/{cus_id}")
//	CreditCardDTO updateCreditCard(@PathVariable("cus_id") int id, @RequestBody CreditCard creditCard)
//	{
//		return creditCardService.updateCreditCard(id, creditCard);
//		
//	}


}
