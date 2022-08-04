package com.flights.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.flights.entities.FlightEntity;
import com.flights.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/{flightNumber}")
	public FlightEntity getFlight(@PathVariable("flightNumber")Long flightNumber) {
		 
		FlightEntity flight= this.flightService.getFlight(flightNumber);
		//http://localhost:9091/schedule/flight/102
		List scheduleFlight=this.restTemplate.getForObject("http://localhost:9091/schedule/flight/"+flight.getFlightNumber(),List.class);
		flight.setScheduleFlight(scheduleFlight);
		return flight;
		
	}

}
