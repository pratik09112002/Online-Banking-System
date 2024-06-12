package com.obs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obs.entities.Customer;
import com.obs.model.CustomerDTO;
import com.obs.service.CustomerService;
import com.obs.utility.Converter;

@RestController
@RequestMapping("/api")

public class CustomerController 
{
	@Autowired
	CustomerService customerService;
	
	@Autowired
	Converter converter;
	
	@PostMapping("/createCustomer")
	ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customerDTO)
	{
		final Customer customer = converter.convertToCustomerEntity(customerDTO);
		return new ResponseEntity<CustomerDTO>(customerService.createCustomer(customer),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllcustomers")
	List<CustomerDTO> getAllcustomers()
	{
		return customerService.getAllCustomers();
		
	}
	
	@GetMapping("/getCustomerById/{cus_id}")
	CustomerDTO getCustomerById(@PathVariable("cus_id") int id)
	{
		return customerService.getCustomerById(id);
		
	}
	
	@DeleteMapping("/deleteCustomer/{cus_id}")
	String deleteCustomerById(@PathVariable("cus_id") int id)
	{
		return customerService.deleteCustomerById(id);
		
	}
	
	@PutMapping("/updateCustomer/{cus_id}")
	CustomerDTO updateCustomer(@PathVariable("cus_id") int id, @RequestBody Customer customer)
	{
		return customerService.updateCustomer(id, customer);
		
	}
	
	
}

























