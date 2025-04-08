package com.epam.hospitalmanagemntsystem.repository;

import com.epam.hospitalmanagemntsystem.entity.AdmissionType;
import com.epam.hospitalmanagemntsystem.entity.Hospital;
import com.epam.hospitalmanagemntsystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdmissionTypeRepository extends JpaRepository<AdmissionType, Long> {
    List<AdmissionType> findByPatientAndHospital(Patient patient, Hospital hospital);
    List<AdmissionType> findByHospital(Hospital hospital);
    List<AdmissionType> findByPatient(Patient patient);
}