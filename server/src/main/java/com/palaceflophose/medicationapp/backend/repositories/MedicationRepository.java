package com.palaceflophose.medicationapp.backend.repositories;

import com.palaceflophose.medicationapp.backend.models.Medication;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;

/**
 * Author: Brandon Shaffer
 * Date: 4/5/2022
 */
public interface MedicationRepository extends MongoRepository<Medication, String> {
}
