package com.epam.hospitalmanagemntsystem.service.serviceImpl;

import com.epam.hospitalmanagemntsystem.entity.Patient;
import com.epam.hospitalmanagemntsystem.repo.PatientRepository;
import com.epam.hospitalmanagemntsystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
    }

    @Override
    public Patient registerPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getPatientsByHospitalId(Long hospitalId) {
        return patientRepository.findAll().stream()
                .filter(patient -> patient.getHospital().getHospitalId().equals(hospitalId))
                .toList();
    }
}