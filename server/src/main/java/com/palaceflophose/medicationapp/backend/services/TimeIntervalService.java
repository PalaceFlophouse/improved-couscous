package com.palaceflophose.medicationapp.backend.services;

import com.palaceflophose.medicationapp.backend.models.TimeInterval;
import com.palaceflophose.medicationapp.backend.repositories.TimeIntervalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Brandon Shaffer
 * Date: 4/10/2022
 */
@Service
@RequiredArgsConstructor
public class TimeIntervalService {

	private final TimeIntervalRepository timeIntervalRepository;

	public TimeInterval addTimeInterval(TimeInterval timeInterval){
		return timeIntervalRepository.insert(timeInterval);
	}

	public void updateTimeInterval(TimeInterval timeInterval){
		TimeInterval existingTimeInterval = timeIntervalRepository.findById(timeInterval.getId()).orElseThrow(()
				-> new RuntimeException("Cannot find TimeInterval with ID: " + timeInterval.getId()));

		existingTimeInterval.setDayOfWeek(timeInterval.getDayOfWeek());
		existingTimeInterval.setTime(timeInterval.getTime());

		timeIntervalRepository.save(existingTimeInterval);
	}

	public List<TimeInterval> getAllTimeIntervals(){
		return timeIntervalRepository.findAll();
	}

	public TimeInterval getTimeIntervalById(String id){
		return timeIntervalRepository.findById(id).orElseThrow(()
				-> new RuntimeException("Cannot find TimeInterval with ID: " + id));
	}

	public void deleteTimeInterval(String id){
		timeIntervalRepository.deleteById(id);
	}
}
