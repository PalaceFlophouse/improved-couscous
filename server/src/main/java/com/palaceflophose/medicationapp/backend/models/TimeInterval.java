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
@Document("Time-Interval")
public class TimeInterval {

	@Id
	private String id;

	private String medicationId;

	private String userId;

	private String dayOfWeek;
	private String time;
}
