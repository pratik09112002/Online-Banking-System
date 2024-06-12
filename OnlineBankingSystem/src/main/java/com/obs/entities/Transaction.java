package com.obs.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Transaction")

public class Transaction 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="Transaction_Type", length = 20)
    private String transactionType;
    
    @Column(name="Amount", length = 15)
    private Double amount;
    
    @Column(name="Transaction_Date_Time")
    private LocalDateTime transactionDateTime;
    
    @Column(name="Description", length = 255)
    private String description;
    
    @Column(name="Payer_Name", length = 50)
    private String payerName;
    
    @Column(name="Payee_Name", length = 50)
    private String payeeName;
    
}












