package com.epam.hospitalmanagemntsystem.repo;

import com.epam.hospitalmanagemntsystem.entity.Diagnosis;
import com.epam.hospitalmanagemntsystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiagnosisRepository extends JpaRepository<Diagnosis, Long> {
    List<Diagnosis> findByPatient(Patient patient);
}