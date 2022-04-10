package com.palaceflophose.medicationapp.backend.controllers;

import com.palaceflophose.medicationapp.backend.models.User;
import com.palaceflophose.medicationapp.backend.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Brandon Shaffer
 * Date: 4/9/2022
 */
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@PostMapping
	public ResponseEntity<Object> addUser(@RequestBody User user){
		userService.addUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping
	public ResponseEntity<Object> updateUser(@RequestBody User user){
		userService.updateUser(user);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		return ResponseEntity.ok(userService.getAllUsers());
	}

	@GetMapping("/{email}")
	public ResponseEntity<User> getUserByEmail(@PathVariable String email){

		return ResponseEntity.ok(userService.getUserByEmail(email));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> removeUser(@PathVariable String id){
		userService.deleteUser(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
