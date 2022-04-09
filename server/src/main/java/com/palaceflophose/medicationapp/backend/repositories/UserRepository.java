package com.palaceflophose.medicationapp.backend.repositories;

import com.palaceflophose.medicationapp.backend.models.UserPojo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

/**
 * Author: Brandon Shaffer
 * Date: 4/5/2022
 */
public interface UserRepository extends MongoRepository<UserPojo, String> {

	UserPojo findByUserName(String username);

	@Query("{email: ?0}")
	Optional<UserPojo> findByEmail(String email);
}
