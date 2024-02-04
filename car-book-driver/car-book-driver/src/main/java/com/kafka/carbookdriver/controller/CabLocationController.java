package com.kafka.carbookdriver.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.carbookdriver.service.CabLoctionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value  = "/location")
@RequiredArgsConstructor
class CabLocationController {

	private final CabLoctionService cabLoctionService;
	
	
	@PutMapping
	public ResponseEntity updateLocation() throws InterruptedException {
		
		int range=100;
		
		while (range>0) {
			cabLoctionService.updateLocation(Math.random()+":"+Math.random());
			Thread.sleep(1000);
			range--;
		}
		return new ResponseEntity<>(Map.of("message","Location Updated"),HttpStatus.OK);
	}
}
