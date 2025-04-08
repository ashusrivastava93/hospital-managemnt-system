package com.epam.hospitalmanagemntsystem.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "diagnosis_details")
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diagnosis_id")
    private Long diagnosisId;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @Column(name = "diagnosis_name", nullable = false)
    private String diagnosisName;

    @Column(name = "diagnosis_date")
    private LocalDateTime diagnosisDate;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    // Constructors, Getters, Setters
}
