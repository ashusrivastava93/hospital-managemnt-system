package com.epam.hospitalmanagemntsystem.service;

import com.epam.hospitalmanagemntsystem.entity.Medication;

import java.util.List;

public interface MedicationService {
    List<Medication> getAllMedications();
    Medication getMedicationById(Long id);
    Medication createMedication(Medication medication);
    Medication updateMedication(Long id, Medication medication);
    void deleteMedication(Long id);
}