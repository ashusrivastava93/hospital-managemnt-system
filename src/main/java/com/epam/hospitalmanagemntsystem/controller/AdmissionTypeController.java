package com.epam.hospitalmanagemntsystem.controller;

import com.epam.hospitalmanagemntsystem.entity.AdmissionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.epam.hospitalmanagemntsystem.service.AdmissionTypeService;

import java.util.List;

@RestController
@RequestMapping("/api/admission-types")
public class AdmissionTypeController {

    @Autowired
    private AdmissionTypeService admissionTypeService;

    @GetMapping
    public List<AdmissionType> getAllAdmissionTypes() {
        return admissionTypeService.getAllAdmissionTypes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdmissionType> getAdmissionTypeById(@PathVariable Long id) {
        return ResponseEntity.ok(admissionTypeService.getAdmissionTypeById(id));
    }

    @PostMapping
    public ResponseEntity<AdmissionType> createAdmissionType(@RequestBody AdmissionType admissionType) {
        return ResponseEntity.ok(admissionTypeService.createAdmissionType(admissionType));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdmissionType> updateAdmissionType(@PathVariable Long id, @RequestBody AdmissionType admissionType) {
        return ResponseEntity.ok(admissionTypeService.updateAdmissionType(id, admissionType));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdmissionType(@PathVariable Long id) {
        admissionTypeService.deleteAdmissionType(id);
        return ResponseEntity.noContent().build();
    }
}