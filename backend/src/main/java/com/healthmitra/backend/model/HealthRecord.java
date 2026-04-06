package com.healthmitra.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Document(collection = "health_record")
public class HealthRecord {

    @Id
    private String id;

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
    private LocalDateTime creSatedAt = LocalDateTime.now();
}