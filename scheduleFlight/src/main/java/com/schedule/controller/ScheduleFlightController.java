package com.schedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.schedule.entity.ScheduleFlightEntity;
import com.schedule.service.ScheduleFlightService;

@RestController
@RequestMapping("/schedule")
public class ScheduleFlightController {
	
	@Autowired
	private ScheduleFlightService scheduleFlight;
	
	@GetMapping("/flight/{flightNumber}")
	public List<ScheduleFlightEntity> getFlight(@PathVariable("flightNumber")Long flightNumber){
		
		return this.scheduleFlight.getScheduleFlightOfFlight(flightNumber);
		
	}

}
