package com.obs.utility;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import com.obs.entities.Customer;
import com.obs.model.CustomerDTO;

@Component
public class Converter 
{

	public Customer convertToCustomerEntity(CustomerDTO customerDTO)
	{
		Customer customer=new Customer();
		if(customerDTO != null)
		{
			BeanUtils.copyProperties(customerDTO, customer);
		}

		return customer;
	}
	
	public CustomerDTO convertToCustomerDTO(Customer customer)
	{
		CustomerDTO customerDTO = new CustomerDTO();
		if(customer != null)
		{
			BeanUtils.copyProperties(customer, customerDTO);
		}
		
		return customerDTO;
	}

}
