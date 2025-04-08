package com.epam.hospitalmanagemntsystem.service;

import com.epam.hospitalmanagemntsystem.entity.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
    Patient registerPatient(Patient patient);
    List<Patient> getPatientsByHospitalId(Long hospitalId);
}