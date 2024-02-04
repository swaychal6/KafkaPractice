package com.kafka.carbookdriver.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.carbookdriver.config.AppConstant;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CabLoctionService {

	private final KafkaTemplate<String,Object> kafkaTemplate;
	
	
	public boolean updateLocation(String location) {
		kafkaTemplate.send(AppConstant.CAB_LOCATION, location);
		return true;
	}
	
}
