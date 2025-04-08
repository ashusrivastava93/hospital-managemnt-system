package com.epam.hospitalmanagemntsystem.service;

import com.epam.hospitalmanagemntsystem.entity.AdmissionType;

import java.util.List;

public interface AdmissionTypeService {
    List<AdmissionType> getAllAdmissionTypes();
    AdmissionType getAdmissionTypeById(Long id);
    AdmissionType createAdmissionType(AdmissionType admissionType);
    AdmissionType updateAdmissionType(Long id, AdmissionType admissionType);
    void deleteAdmissionType(Long id);
}