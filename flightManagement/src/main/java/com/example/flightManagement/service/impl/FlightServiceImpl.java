package com.example.flightManagement.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightManagement.model.Flight;
import com.example.flightManagement.repository.FlightRepository;
import com.example.flightManagement.service.FlightService;

//FlightServiceImpl will implement all the methods of FlightService class
@Service
public class FlightServiceImpl implements FlightService {
	//Dependency Injection
	@Autowired  //automated dependency injection
	private FlightRepository flightRepository;
	
   //Parameterized constructor
	public FlightServiceImpl(FlightRepository flightRepository) {
		super();
		this.flightRepository = flightRepository;
	}
	@Override
	public Flight saveFlight(Flight flight) {
		
		return flightRepository.save(flight);
	}

	@Override
	public List<Flight> getAllFlight() {
		
		return flightRepository.findAll();
	}
	@Override
	public void deleteFlight(long flightNumber) {
		
		
		flightRepository.deleteById(flightNumber);
		
	}
	@Override
	public Flight updateFlight(Flight flight) {
		
		
		
		return flightRepository.save(flight);
	}
}
