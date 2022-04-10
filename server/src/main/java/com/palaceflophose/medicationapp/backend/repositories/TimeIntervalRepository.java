package com.palaceflophose.medicationapp.backend.repositories;

import com.palaceflophose.medicationapp.backend.models.TimeInterval;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Author: Brandon Shaffer
 * Date: 4/5/2022
 */
public interface TimeIntervalRepository extends MongoRepository<TimeInterval, String> {
}
