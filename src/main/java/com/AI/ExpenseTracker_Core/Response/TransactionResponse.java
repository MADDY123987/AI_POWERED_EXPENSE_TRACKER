package com.AI.ExpenseTracker_Core.Response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private Long transactionId;
    private String transactionType;
    private String description;
    private Double amount;
    private String transferId;
}
