package com.obs.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TransactionDTO 
{
    private Long id;
    private String transactionType;
    private Double amount;
    private LocalDateTime transactionDateTime;
    private String description;
    private String payerName;
    private String payeeName;

}
