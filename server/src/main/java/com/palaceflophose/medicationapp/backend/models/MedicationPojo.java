package com.palaceflophose.medicationapp.backend.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Author: Brandon Shaffer
 * Date: 4/5/2022
 */
@Builder
@Data
@Document("Medication")
public class MedicationPojo {

	@Id
	private String id;

}
