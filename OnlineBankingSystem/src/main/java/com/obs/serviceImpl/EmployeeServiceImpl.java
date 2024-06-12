package com.obs.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obs.entities.Employee;
import com.obs.model.EmployeeDTO;
import com.obs.repository.EmployeeRepository;
import com.obs.service.EmployeeService;
import com.obs.utility.EmployeeConverter;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeeConverter employeeConverter;

	@Override
	public EmployeeDTO createEmployee(Employee employee) 
	{
		// TODO Auto-generated method stub
		Employee emp = employeeRepository.save(employee);
		
		return employeeConverter.convertEmployeeDTO(emp);
	}

	@Override
	public List<EmployeeDTO> getAllEmployees() 
	{
		// TODO Auto-generated method stub
		
		List<Employee> employees = employeeRepository.findAll();
		List<EmployeeDTO> dtoe = new ArrayList<>();
		for (Employee e : employees)
		{
			dtoe.add(employeeConverter.convertEmployeeDTO(e));
			
		}
		
		return dtoe;
	}

	@Override
	public EmployeeDTO getEmployeeById(int id) 
	{
		// TODO Auto-generated method stub
		
		Employee emp = employeeRepository.findById(id).get();
		return employeeConverter.convertEmployeeDTO(emp);
	}

	@Override
	public String deleteEmployeeById(int id) 
	{
		// TODO Auto-generated method stub
		
		employeeRepository.deleteById(id);
		return "Employee Deleted";
	}

	@Override
	public EmployeeDTO updateEmployee(int id, Employee employee) 
	{
		// TODO Auto-generated method stub
		
		Employee e1=employeeRepository.findById(id).get();
		e1.setFirstName(employee.getFirstName());
		e1.setLastName(employee.getLastName());
		e1.setAdd(employee.getAdd());
		e1.setGender(employee.getGender());
		e1.setPhoneNumber(employee.getPhoneNumber());
		e1.setEmailId(employee.getEmailId());
		e1.setSalary(employee.getSalary());
		e1.setJoinDate(employee.getJoinDate());
		
		Employee emp = employeeRepository.save(e1);
		
		return employeeConverter.convertEmployeeDTO(emp);
	}
	
	
	

}
