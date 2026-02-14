package com.jasshackers.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private double amount;

    @Enumerated(EnumType.STRING)
    private Category category;

    private LocalDateTime timestamp = LocalDateTime.now();

    private boolean overrideUsed = false;
}