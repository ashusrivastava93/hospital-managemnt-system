package com.epam.hospitalmanagemntsystem.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "medication_details")
@Data
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medication_id")
    private Long medicationId;

    @Column(name = "medication_name", nullable = false)
    private String medicationName;

    @Column(name = "dosage")
    private String dosage;

    @Column(name = "frequency")
    private String frequency;

    @Column(name = "route")
    private String route;

    @ManyToMany
    @JoinTable(
            name = "diagnosis_medication",
            joinColumns = @JoinColumn(name = "diagnosis_id"),
            inverseJoinColumns = @JoinColumn(name = "medication_id")
    )
    private List<Diagnosis> diagnoses = new ArrayList<>(); // Assuming medication is linked to diagnosis
}

