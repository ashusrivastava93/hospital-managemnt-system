package com.epam.hospitalmanagemntsystem.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;


@Entity
@Table(name = "room_details")
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long roomId;

    @ManyToOne
    @JoinColumn(name = "hospital_id", nullable = false)
    private Hospital hospital;

    @Column(name = "room_number", nullable = false)
    private String roomNumber;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "is_available", columnDefinition = "BOOLEAN DEFAULT TRUE")
    private boolean isAvailable;

    @Column(name = "charges")
    private BigDecimal charges;

    // Constructors, Getters, Setters
}