package com.epam.hospitalmanagemntsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;


@Entity
@Table(name = "insurance_details")
@Data
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insurance_id")
    private Long insuranceId;

    @Column(name = "insurance_provider", nullable = false)
    private String insuranceProvider;

    @Column(name = "policy_number")
    private String policyNumber;

    @Column(name = "coverage_amount")
    private BigDecimal coverageAmount;

    // Constructors, Getters, Setters
}
