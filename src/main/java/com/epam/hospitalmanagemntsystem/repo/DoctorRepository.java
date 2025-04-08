package com.epam.hospitalmanagemntsystem.repo;

import com.epam.hospitalmanagemntsystem.entity.Doctor;
import org.springframework.stereotype.Repository;
import com.epam.hospitalmanagemntsystem.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findByHospital(Hospital hospital);
}