package com.palaceflophose.medicationapp.backend.services;

import com.palaceflophose.medicationapp.backend.models.User;
import com.palaceflophose.medicationapp.backend.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Brandon Shaffer
 * Date: 4/9/2022
 */
@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public void addUser(User user){
		this.userRepository.insert(user);
	}

	public void updateUser(User user){
		User existingUser = userRepository.findById(user.getEmail())
				.orElseThrow(() -> new RuntimeException(
						"Cannot find User with Email: " + user.getEmail()
				));

		existingUser.setEmail(user.getEmail());

		userRepository.save(user);
	}

	public List<User> getAllUsers(){
		return userRepository.findAll();
	}

	public User getUserByEmail(String email){
		return userRepository.findByEmail(email).orElseThrow(() ->
				new RuntimeException("Cannot find user by email " + email));

	}

	public void deleteUser(String email){
		userRepository.deleteById(email);
	}
}
