package com.example.flightManagement.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightManagement.model.Flight;
import com.example.flightManagement.service.FlightService;
/*
 * Controller classs- responsible for processing the incoming REST API request
 * prepares a model and returning view to be rendered as response
 */
@RestController                    //It allows Spring to recognize it as RESTful service during runtime
@RequestMapping("/flight")      //It is used at class level and handles HTTP request
public class FlightController {
	
	//Dependency Injection of flightServie class 
	private FlightService flightService;
    
	//Parameterized Constructor
	public FlightController(FlightService flightService) {
		super();
		this.flightService = flightService;
	}
	//save method
	@PostMapping()
	public ResponseEntity<Flight> saveFlight(@RequestBody Flight flight){
		return new ResponseEntity<Flight>(flightService.saveFlight(flight),HttpStatus.CREATED);
	
	}
	//Read all record
	@GetMapping
	public List<Flight> getAllFlight(){
		return flightService.getAllFlight();
	}
	
	
	@DeleteMapping("/delete/{flightNumber}")
	public void deleteFlight(@PathVariable("flightNumber") Long flightNumber) {
		flightService.deleteFlight(flightNumber);
	}
	
	//update
	@PutMapping("/update")
	public Flight updateFlight(@RequestBody Flight flight) {
		return flightService.updateFlight(flight);
	}
	
		

}
