package com.palaceflophose.medicationapp.backend;

import com.palaceflophose.medicationapp.backend.repositories.MedicationRepository;
import com.palaceflophose.medicationapp.backend.repositories.TimeIntervalRepository;
import com.palaceflophose.medicationapp.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class BackendApplication {

	@Autowired
	MedicationRepository medicationRepository;

	@Autowired
	TimeIntervalRepository timeIntervalRepository;
	
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
}
