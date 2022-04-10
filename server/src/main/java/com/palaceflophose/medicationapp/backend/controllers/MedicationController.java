package com.palaceflophose.medicationapp.backend.controllers;

import com.palaceflophose.medicationapp.backend.models.Medication;
import com.palaceflophose.medicationapp.backend.services.MedicationService;
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
@RequestMapping("/api/medication")
@RequiredArgsConstructor
public class MedicationController {

	private final MedicationService medicationService;

	@PostMapping
	public ResponseEntity<Object> addMedication(@RequestBody Medication medication){
		medicationService.addMedication(medication);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping
	public ResponseEntity<Object> updateMedication(@RequestBody Medication medication){
		medicationService.updateMedication(medication);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<List<Medication>> getAllMedications(){
		return ResponseEntity.ok(medicationService.getAllMedications());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Medication> getMedicationById(@PathVariable String id){
		return ResponseEntity.ok(medicationService.getMedicationById(id));
	}

	@DeleteMapping("/{id}")
	public void deleteMedication(@PathVariable String id){
		medicationService.deleteMedication(id);
	}
}
