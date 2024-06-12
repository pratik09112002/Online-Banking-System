package com.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obs.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>
{
	
}
