package com.obs.entities;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Account_Details")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="AccountId", length = 20)
    private int id;
    
    @Column(name="AccountNumber", length = 20)
    private String accountNumber;
    
    @Column(name="Balance")
    private double balance;
    
    @Column(name="AccountHolderName", length = 50)
    private String accountHolderName;
    
    @Column(name="AccountType", length = 20)
    private String accountType;
    
    @Column(name="DateCreated")
    private LocalDateTime dateCreated;
    
    @Column(name="Status", length = 20)
    private String status;

}
