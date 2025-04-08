package com.epam.hospitalmanagemntsystem.repo;

import com.epam.hospitalmanagemntsystem.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}