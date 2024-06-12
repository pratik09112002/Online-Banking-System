package com.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obs.entities.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Integer>
{

}
