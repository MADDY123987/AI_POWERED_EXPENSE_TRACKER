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
public class UserConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Enumerated(EnumType.STRING)
    private LanguagePreference languagePreference;

    private Long createdAt;
    private Long updatedAt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="app_user_id")
    private AppUser appUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "default_payment_mode_id")
    private PaymentMode paymentMode;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "default_account_id")
    private Account defaultaccount;

}
