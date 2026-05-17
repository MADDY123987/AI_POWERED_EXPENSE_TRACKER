package com.AI.ExpenseTracker_Core.model;


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
public class Ai_Parsing_Task {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String rawInput;
    private String errorMessage;
    private String correlationId;
    private Long createdAt;

    @Enumerated(EnumType.STRING)
    private Status status;
}
