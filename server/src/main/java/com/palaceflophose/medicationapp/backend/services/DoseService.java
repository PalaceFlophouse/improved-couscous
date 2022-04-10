package com.palaceflophose.medicationapp.backend.services;

import com.palaceflophose.medicationapp.backend.models.Dose;
import com.palaceflophose.medicationapp.backend.repositories.DoseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Brandon Shaffer
 * Date: 4/10/2022
 */

@Service
@RequiredArgsConstructor
public class DoseService {

	private final DoseRepository doseRepository;

	public Dose addDose(Dose dose){
		return doseRepository.insert(dose);
	}

	public void updateDose(Dose dose){
		Dose existingDose = doseRepository.findById(dose.getId()).orElseThrow(()
				-> new RuntimeException("Cannot find Dose with ID: " + dose.getId()));

		existingDose.setId(dose.getId());
		existingDose.setDose(dose.getDose());

		doseRepository.save(existingDose);
	}

	public List<Dose> getAllDoses(){
		return doseRepository.findAll();
	}

	public Dose getDoseById(String id){
		return doseRepository.findById(id).orElseThrow(()
				-> new RuntimeException("Cannot find Dose with ID: " + id));
	}

	public void deleteDose(String id){
		doseRepository.deleteById(id);
	}
}
