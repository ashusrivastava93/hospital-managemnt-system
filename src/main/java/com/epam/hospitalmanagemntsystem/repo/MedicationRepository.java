package com.epam.hospitalmanagemntsystem.repository;

import com.epam.hospitalmanagemntsystem.entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicationRepository extends JpaRepository<Medication, Long> {
}