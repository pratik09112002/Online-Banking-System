package com.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obs.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

}
