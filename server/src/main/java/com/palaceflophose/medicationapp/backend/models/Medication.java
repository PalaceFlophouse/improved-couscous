package com.palaceflophose.medicationapp.backend.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Author: Brandon Shaffer
 * Date: 4/5/2022
 */
@Builder
@Data
@Document("Medication")
public class Medication {

	@Id
	private String id;

	private String userId;
	private List<String> timeIds;
	private String doseId;

	private String name;
}
