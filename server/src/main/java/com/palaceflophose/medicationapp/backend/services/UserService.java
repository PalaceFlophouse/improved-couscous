package com.palaceflophose.medicationapp.backend.services;

import com.palaceflophose.medicationapp.backend.models.UserPojo;
import com.palaceflophose.medicationapp.backend.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Brandon Shaffer
 * Date: 4/9/2022
 */
@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository){
		this.userRepository = userRepository;
	}

	public void addUser(UserPojo userPojo){
		this.userRepository.insert(userPojo);
	}

	public void updateUser(UserPojo userPojo){
		UserPojo existingUser = userRepository.findById(userPojo.getEmail())
				.orElseThrow(() -> new RuntimeException(
						"Cannot find User with Email: " + userPojo.getEmail()
				));

		existingUser.setEmail(userPojo.getEmail());

		userRepository.save(userPojo);
	}

	public List<UserPojo> getAllUsers(){
		return userRepository.findAll();
	}

	public UserPojo getUserByEmail(String email){
		return userRepository.findByEmail(email).orElseThrow(() ->
				new RuntimeException("Cannot find user by email " + email));

	}

	public void deleteUser(String email){
		userRepository.deleteById(email);
	}
}
