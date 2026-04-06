package com.healthmitra.backend.controller;

import com.healthmitra.backend.model.HealthRecord;
import com.healthmitra.backend.repository.HealthRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/health")
@CrossOrigin(origins = "http://localhost:5173") // Adjust port as per your frontend
public class HealthController {

    @Autowired
    private HealthRecordRepository repository;

    @GetMapping("/records")
    public List<HealthRecord> getAllRecords() {
        return repository.findAll();
    }

    @PostMapping("/records")
    public HealthRecord createRecord(@RequestBody HealthRecord record) {
        return repository.save(record);
    }
}
