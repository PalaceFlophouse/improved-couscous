package com.palaceflophose.medicationapp.backend.repositories;

import com.palaceflophose.medicationapp.backend.models.Dose;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Author: Brandon Shaffer
 * Date: 4/9/2022
 */
public interface DoseRepository extends MongoRepository<Dose, String> {
}
