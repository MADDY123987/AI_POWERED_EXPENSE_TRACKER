package com.AI.ExpenseTracker_Core.model;


import com.AI.ExpenseTracker_Core.Enum.TransactionBehavior;
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
public class PaymentMode {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    @OneToMany(mappedBy = "paymentMode",fetch = FetchType.LAZY)
    private Set<Transaction> transactionSet;

    @OneToMany(mappedBy = "defaultPaymentMode",fetch = FetchType.LAZY)
    private Set<UserConfig> userConfigSet;

    @Enumerated(EnumType.STRING)
    private TransactionBehavior type;
}
