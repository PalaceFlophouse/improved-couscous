package com.palaceflophose.medicationapp.backend.repositories;

import com.palaceflophose.medicationapp.backend.models.TimeIntervalPojo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Author: Brandon Shaffer
 * Date: 4/5/2022
 */
public interface TimeIntervalRepository extends MongoRepository<TimeIntervalPojo, String> {

	TimeIntervalPojo findByDayAndTime(String day, String time);

}
