package com.obs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obs.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>
{

}
