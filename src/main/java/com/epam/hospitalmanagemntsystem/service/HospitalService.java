package com.epam.hospitalmanagemntsystem.service;

import com.epam.hospitalmanagemntsystem.entity.Hospital;

import java.util.List;

public interface HospitalService {
    List<Hospital> getAllHospitals();
    Hospital getHospitalById(Long id);
}