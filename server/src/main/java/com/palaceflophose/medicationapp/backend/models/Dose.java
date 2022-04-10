package com.palaceflophose.medicationapp.backend.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Author: Brandon Shaffer
 * Date: 4/7/2022
 */
@Builder
@Data
@Document("Dose")
public class Dose {

	@Id
	private String id;

	private String dose;

}
