package com.flights.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flights.entities.FlightEntity;
@Service
public class FlightServiceImplt  implements FlightService{
     
	//List to store all the detail
	List<FlightEntity> list=List.of(new FlightEntity(101L,"458F6","SpiceJet",150),
			new FlightEntity(102L,"359T6","Indigo",150),
			new FlightEntity(103L,"238C6","KingFisher",150));
	
	@Override
	public FlightEntity getFlight(Long id) {
		 return list.stream()
		.filter( flight -> flight.getFlightNumber().equals(id)).findAny().orElse(null);
	}

}
