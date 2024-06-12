package com.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obs.entities.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer>
{

}
