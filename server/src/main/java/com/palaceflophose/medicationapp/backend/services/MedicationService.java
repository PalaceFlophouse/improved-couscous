package com.palaceflophose.medicationapp.backend.services;

import com.palaceflophose.medicationapp.backend.models.Medication;
import com.palaceflophose.medicationapp.backend.repositories.MedicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Author: Brandon Shaffer
 * Date: 4/10/2022
 */
@Service
@RequiredArgsConstructor
public class MedicationService {

	private final MedicationRepository medicationRepository;

	public Medication addMedication(Medication medication){
		return medicationRepository.insert(medication);
	}

	public void updateMedication(Medication medication){
		Medication existingMedication = medicationRepository.findById(medication.getId()).orElseThrow(()
				-> new RuntimeException("Cannot find Medication with ID: " + medication.getId()));

		existingMedication.setDoseId(medication.getDoseId());
		existingMedication.setName(medication.getName());
		existingMedication.setTimeIds(medication.getTimeIds());

		medicationRepository.save(existingMedication);
	}

	public List<Medication> getAllMedications(){
		return medicationRepository.findAll();
	}

	public Medication getMedicationById(String id){
		return medicationRepository.findById(id).orElseThrow(()
				-> new RuntimeException("Cannot find Medication with ID: " + id));
	}

	public void deleteMedication(String id){
		medicationRepository.deleteById(id);
	}
}
