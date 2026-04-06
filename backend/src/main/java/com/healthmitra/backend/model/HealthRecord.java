package com.healthmitra.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class HealthRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patientName;
    private String email;
    private String phone;
    private Integer age;
    private String gender;
    private String specialty;
    private String doctor;
    private String bookingDate;
    private String bookingTime;
    private String status;
    private String notes;
    private String type;
    private LocalDateTime createdAt = LocalDateTime.now();
}
