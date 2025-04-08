package com.epam.hospitalmanagemntsystem.service.serviceImpl;

import com.epam.hospitalmanagemntsystem.entity.AdmissionType;
import com.epam.hospitalmanagemntsystem.repository.AdmissionTypeRepository;
import com.epam.hospitalmanagemntsystem.service.AdmissionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdmissionTypeServiceImpl implements AdmissionTypeService {

    @Autowired
    private AdmissionTypeRepository admissionTypeRepository;

    @Override
    public List<AdmissionType> getAllAdmissionTypes() {
        return admissionTypeRepository.findAll();
    }

    @Override
    public AdmissionType getAdmissionTypeById(Long id) {
        Optional<AdmissionType> admissionType = admissionTypeRepository.findById(id);
        return admissionType.orElseThrow(() -> new RuntimeException("AdmissionType not found with id: " + id));
    }

    @Override
    public AdmissionType createAdmissionType(AdmissionType admissionType) {
        return admissionTypeRepository.save(admissionType);
    }

    @Override
    public AdmissionType updateAdmissionType(Long id, AdmissionType admissionType) {
        AdmissionType existingAdmissionType = getAdmissionTypeById(id);
        existingAdmissionType.setTypeName(admissionType.getTypeName());
        return admissionTypeRepository.save(existingAdmissionType);
    }

    @Override
    public void deleteAdmissionType(Long id) {
        admissionTypeRepository.deleteById(id);
    }
}