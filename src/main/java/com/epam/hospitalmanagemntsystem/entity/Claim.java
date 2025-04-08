package com.epam.hospitalmanagemntsystem.entity;

import lombok.Data;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "claim_details")
@Data
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "claim_id")
    private Long claimId;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "insurance_id")
    private Insurance insurance;

    @Column(name = "claim_date")
    private LocalDateTime claimDate;

    @Column(name = "claim_amount")
    private BigDecimal claimAmount;

    @Column(name = "status")
    private String status;

    // Constructors, Getters, Setters
}