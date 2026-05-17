package com.AI.ExpenseTracker_Core.model;


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
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "bank",fetch = FetchType.LAZY)
    private Set<Account> accountSet;
}

