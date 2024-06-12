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

import com.obs.entities.Employee;
import com.obs.model.EmployeeDTO;
import com.obs.service.EmployeeService;
import com.obs.utility.EmployeeConverter;

public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	EmployeeConverter employeeConverter;
	
	@PostMapping("/createEmployee")
	ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO)
	{
		final Employee employee = employeeConverter.convertToEmpployeeEntity(employeeDTO);
		return new ResponseEntity<EmployeeDTO>(employeeService.createEmployee(employee),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllemployees")
	List<EmployeeDTO> getAllemployees()
	{
		return employeeService.getAllEmployees();
		
	}
	
	@GetMapping("/getEmployeeById/{cus_id}")
	EmployeeDTO getEmployeeById(@PathVariable("cus_id") int id)
	{
		return employeeService.getEmployeeById(id);
		
	}
	
	@DeleteMapping("/deleteEmployee/{cus_id}")
	String deleteEmployeeById(@PathVariable("cus_id") int id)
	{
		return employeeService.deleteEmployeeById(id);
		
	}
	
	@PutMapping("/updateEmployee/{cus_id}")
	EmployeeDTO updateEmolyee(@PathVariable("cus_id") int id, @RequestBody Employee employee)
	{
		return employeeService.updateEmployee(id, employee);
		
	}

}
