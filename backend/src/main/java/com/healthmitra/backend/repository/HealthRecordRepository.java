package com.healthmitra.backend.repository;

import com.healthmitra.backend.model.HealthRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HealthRecordRepository extends MongoRepository<HealthRecord, String> {
}