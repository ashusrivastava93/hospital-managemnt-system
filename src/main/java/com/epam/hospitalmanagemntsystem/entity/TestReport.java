package com.epam.hospitalmanagemntsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "test_report_details")
@Data
public class TestReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Long reportId;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @Column(name = "test_name", nullable = false)
    private String testName;

    @Column(name = "test_date")
    private LocalDate testDate;

    @Column(name = "result", columnDefinition = "TEXT")
    private String result;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;

    // Constructors, Getters, Setters
}