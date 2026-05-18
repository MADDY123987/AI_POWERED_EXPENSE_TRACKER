package com.AI.ExpenseTracker_Core.model;


import com.AI.ExpenseTracker_Core.Enum.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    private Double amount;
    private String transactionDate;
    private String transferId;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_mode_id")
    private PaymentMode paymentMode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    private Set<AiParsingTask> aiParsingTaskSet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="app_user_id")
    private AppUser appUser;

    private Long createdAt = System.currentTimeMillis();
    private Long updatedAt;
}
