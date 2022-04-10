package com.palaceflophose.medicationapp.backend.repositories;

import com.palaceflophose.medicationapp.backend.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

/**
 * Author: Brandon Shaffer
 * Date: 4/5/2022
 */
public interface UserRepository extends MongoRepository<User, String> {

	@Query("{email: ?0}")
	Optional<User> findByEmail(String email);
}
