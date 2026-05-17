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
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private CardType cardType;

    private String lastFourDigit;
    private Double creditLimit;

    private Long createdAt;
    private Long updatedAt;

    private Account account;
}
