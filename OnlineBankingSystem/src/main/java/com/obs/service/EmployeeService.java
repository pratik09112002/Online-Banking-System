package com.obs.service;

import java.util.List;

import com.obs.entities.Employee;
import com.obs.model.EmployeeDTO;

public interface EmployeeService 
{
	EmployeeDTO createEmployee (Employee employee);
	List<EmployeeDTO> getAllEmployees();
	EmployeeDTO getEmployeeById(int id);
	String deleteEmployeeById(int id);
	EmployeeDTO updateEmployee(int id, Employee employee);

}
