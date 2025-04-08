package com.epam.hospitalmanagemntsystem.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
@Entity
@Table(name = "admission_type_details")
@Data
public class AdmissionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admission_type_id")
    private Long admissionTypeId;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "hospital_id", nullable = false)
    private Hospital hospital;

    @Column(name = "admission_date")
    private LocalDateTime admissionDate;

    @Column(name = "reason")
    private String reason;

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    @Column(name = "type_name")
    private String typeName;
}