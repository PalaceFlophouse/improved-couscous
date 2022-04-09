package com.palaceflophose.medicationapp.backend.controllers;

import com.palaceflophose.medicationapp.backend.models.UserPojo;
import com.palaceflophose.medicationapp.backend.services.UserService;
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
public class UserController {

	private final UserService userService;

	public UserController(UserService userService){
		this.userService = userService;
	}

	@PostMapping
	public ResponseEntity<Object> addUser(@RequestBody UserPojo userPojo){
		userService.addUser(userPojo);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping
	public ResponseEntity<Object> updateUser(UserPojo userPojo){
		userService.updateUser(userPojo);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<List<UserPojo>> getAllUsers(){
		return ResponseEntity.ok(userService.getAllUsers());
	}

	@GetMapping("/{email}")
	public ResponseEntity<UserPojo> getUserByEmail(@PathVariable String email){

		return ResponseEntity.ok(userService.getUserByEmail(email));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> removeUser(@PathVariable String id){
		userService.deleteUser(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
