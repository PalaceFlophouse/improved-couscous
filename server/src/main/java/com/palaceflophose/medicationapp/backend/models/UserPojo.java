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
@AllArgsConstructor
@Document("User")
public class UserPojo {

	@Id
	@Indexed(unique = true)
	private String email;

	private List<String> medIds;

	public String getEmail() {
		return email;
	}

	public UserPojo setEmail(String email) {
		this.email = email;
		return this;
	}
}
