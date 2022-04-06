package com.palaceflophose.medicationapp.backend.repositories;

import com.palaceflophose.medicationapp.backend.models.UserPojo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Author: Brandon Shaffer
 * Date: 4/5/2022
 */
public interface UserRepository extends MongoRepository<UserPojo, String> {
}
