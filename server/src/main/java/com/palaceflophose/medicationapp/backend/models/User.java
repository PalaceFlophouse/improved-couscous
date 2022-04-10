package com.palaceflophose.medicationapp.backend.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Author: Brandon Shaffer
 * Date: 4/5/2022
 */
@Builder
@Data
@Document("User")
public class User {

	@Id
	@Indexed(unique = true)
	private String email;

	private String password;

	private List<String> medIds;
}
