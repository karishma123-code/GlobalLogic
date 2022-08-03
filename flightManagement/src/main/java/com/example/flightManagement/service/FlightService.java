package com.example.flightManagement.service;

import java.util.List;

import com.example.flightManagement.model.Flight;

//abstract class  used to declare the CRUD methods
public interface FlightService {
	//C
	//Use POST method in the Postman to enter the details
	//method to save the flights details
	Flight saveFlight(Flight flight);
	
	//R
	//Read the flight records- all 
	List<Flight> getAllFlight();
	
	//U
	//Update/modify the flight
	Flight updateFlight(Flight flight);
	
	
	
	//D
	//Delete
	 void deleteFlight(long flightNumber);
	
	

}
