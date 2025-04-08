package com.epam.hospitalmanagemntsystem.service.serviceImpl;

import com.epam.hospitalmanagemntsystem.entity.Medication;
import com.epam.hospitalmanagemntsystem.repository.MedicationRepository;
import com.epam.hospitalmanagemntsystem.service.MedicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicationServiceImpl implements MedicationService {

    @Autowired
    private MedicationRepository medicationRepository;

    @Override
    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }

    @Override
    public Medication getMedicationById(Long id) {
        Optional<Medication> medication = medicationRepository.findById(id);
        return medication.orElseThrow(() -> new RuntimeException("Medication not found with id: " + id));
    }

    @Override
    public Medication createMedication(Medication medication) {
        return medicationRepository.save(medication);
    }

    @Override
    public Medication updateMedication(Long id, Medication medication) {
        Medication existingMedication = getMedicationById(id);
        existingMedication.setMedicationName(medication.getMedicationName());
        existingMedication.setDosage(medication.getDosage());
        existingMedication.setFrequency(medication.getFrequency());
        existingMedication.setRoute(medication.getRoute());
        existingMedication.setDiagnoses(medication.getDiagnoses());
        return medicationRepository.save(existingMedication);
    }

    @Override
    public void deleteMedication(Long id) {
        medicationRepository.deleteById(id);
    }
}