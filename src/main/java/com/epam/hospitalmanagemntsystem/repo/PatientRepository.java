package com.epam.hospitalmanagemntsystem.repo;

import com.epam.hospitalmanagemntsystem.entity.Hospital;
import com.epam.hospitalmanagemntsystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByHospital(Hospital hospital);
}