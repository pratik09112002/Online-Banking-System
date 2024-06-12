package com.obs.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obs.entities.Customer;
import com.obs.model.CustomerDTO;
import com.obs.repository.CustomerRepository;
import com.obs.service.CustomerService;
import com.obs.utility.Converter;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	Converter converter;

	@Override
	public CustomerDTO createCustomer(Customer customer) 
	{
		Customer cust=customerRepository.save(customer);
		return converter.convertToCustomerDTO(cust);
	}

	@Override
	public List<CustomerDTO> getAllCustomers()
	{
		List<Customer> customers=customerRepository.findAll();
		List<CustomerDTO> dtoc = new ArrayList<>();
		for(Customer c : customers)
		{
			dtoc.add(converter.convertToCustomerDTO(c));
		}
		return dtoc;
	}

	@Override
	public CustomerDTO getCustomerById(int id) 
	{
		Customer c = customerRepository.findById(id).get();
		return converter.convertToCustomerDTO(c);
	}

	@Override
	public String deleteCustomerById(int id) 
	{
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
		return "Customer Deleted";
	}

	@Override
	public CustomerDTO updateCustomer(int id, Customer customer) 
	{
		// TODO Auto-generated method stub
		
		Customer c1=customerRepository.findById(id).get();
		c1.setFirstName(customer.getFirstName());
		c1.setLastName(customer.getLastName());
		c1.setAddress(customer.getAddress());
		c1.setAge(customer.getAge());
		c1.setPhNo(customer.getPhNo());
		c1.setAddharNo(customer.getAddharNo());
		c1.setCustomerGender(customer.getCustomerGender());
		
		Customer cust=customerRepository.save(c1);
		
		return converter.convertToCustomerDTO(cust);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
