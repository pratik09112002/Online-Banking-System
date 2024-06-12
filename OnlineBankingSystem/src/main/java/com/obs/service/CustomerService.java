package com.obs.service;

import java.util.List;

import com.obs.entities.Customer;
import com.obs.model.CustomerDTO;

public interface CustomerService 
{
	CustomerDTO createCustomer(Customer customer); 
	List<CustomerDTO> getAllCustomers();
	CustomerDTO getCustomerById(int id);
	String deleteCustomerById(int id);
	CustomerDTO updateCustomer(int id, Customer customer);
	
	
}
