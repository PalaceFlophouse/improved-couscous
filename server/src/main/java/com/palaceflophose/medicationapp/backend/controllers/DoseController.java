package com.palaceflophose.medicationapp.backend.controllers;

import com.palaceflophose.medicationapp.backend.models.Dose;
import com.palaceflophose.medicationapp.backend.services.DoseService;
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
@RequestMapping("/api/dose")
@RequiredArgsConstructor
public class DoseController {

	private final DoseService doseService;

	@PostMapping
	public ResponseEntity<Object> addDose(@RequestBody Dose dose){
		doseService.addDose(dose);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping
	public ResponseEntity<Object> updateDose(@RequestBody Dose dose){
		doseService.updateDose(dose);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<List<Dose>> getAllDoses(){
		return ResponseEntity.ok(doseService.getAllDoses());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Dose> getDoseById(@PathVariable String id){
		return ResponseEntity.ok(doseService.getDoseById(id));
	}

	@DeleteMapping("/{id}")
	public void deleteDose(@PathVariable String id){
		doseService.deleteDose(id);
	}
}
