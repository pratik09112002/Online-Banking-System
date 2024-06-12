package com.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obs.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
