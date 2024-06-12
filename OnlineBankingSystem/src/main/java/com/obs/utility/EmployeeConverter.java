package com.obs.utility;

import org.springframework.beans.BeanUtils;

import com.obs.entities.Employee;
import com.obs.model.EmployeeDTO;

public class EmployeeConverter 
{

	public Employee convertToEmpployeeEntity(EmployeeDTO employeeDTO)
	{
		Employee employee=new Employee();
		
		if(employeeDTO != null)
		{
			BeanUtils.copyProperties(employeeDTO, employee);
		}

		return employee;
	}
	
	public EmployeeDTO convertEmployeeDTO(Employee employee)
	{
		EmployeeDTO employeeDTO = new EmployeeDTO();
		if(employee != null)
		{
			BeanUtils.copyProperties(employee, employeeDTO);
		}
		
		return employeeDTO;
	}


}
