package com.palaceflophose.medicationapp.backend.controllers;

import com.palaceflophose.medicationapp.backend.models.TimeInterval;
import com.palaceflophose.medicationapp.backend.services.TimeIntervalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Brandon Shaffer
 * Date: 4/10/2022
 */
@RestController
@RequestMapping("/api/timeinterval")
@RequiredArgsConstructor
public class TimeIntervalController {

	private final TimeIntervalService timeIntervalService;

	@PostMapping
	public ResponseEntity<Object> addTimeInterval(@RequestBody TimeInterval timeInterval){
		timeIntervalService.addTimeInterval(timeInterval);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping
	public ResponseEntity<Object> updateTimeInterval(@RequestBody TimeInterval timeInterval){
		timeIntervalService.updateTimeInterval(timeInterval);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<List<TimeInterval>> getAllTimeIntervals(){
		return ResponseEntity.ok(timeIntervalService.getAllTimeIntervals());
	}

	@GetMapping("/{id}")
	public ResponseEntity<TimeInterval> getTimeIntervalById(@PathVariable String id){
		return ResponseEntity.ok(timeIntervalService.getTimeIntervalById(id));
	}

	@DeleteMapping("/{id}")
	public void deleteTimeInterval(@PathVariable String id){
		timeIntervalService.deleteTimeInterval(id);
	}
}
