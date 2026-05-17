package com.AI.ExpenseTracker_Core.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private TransactionType transactionType;

    private Double amount;
    private String transactionDate;
    private String transferId;
    private String description;


    private Long createdAt = System.currentTimeMillis();
    private Long updatedAt;
}
