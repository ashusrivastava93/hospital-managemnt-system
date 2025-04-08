package com.epam.hospitalmanagemntsystem.repo;

import com.epam.hospitalmanagemntsystem.entity.Claim;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.epam.hospitalmanagemntsystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {
    List<Claim> findByPatient(Patient patient);

}