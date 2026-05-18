package com.AI.ExpenseTracker_Core.model;


import com.AI.ExpenseTracker_Core.Enum.CardType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Enumerated(EnumType.STRING)
    private CardType cardType;

    private String lastFourDigit;
    private Double creditLimit;
    private Long createdAt;
    private Long updatedAt;

    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;
}
