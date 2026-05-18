package com.AI.ExpenseTracker_Core.Request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {
    private Long transactionId;
    private String transactionType;
    private String description;
    private Double amount;
    private String transactionDate;
    private Long paymentModeId;
    private Long accountId;
    private Long appUserId;
    private Long categoryId;
    private String transferId;
}
