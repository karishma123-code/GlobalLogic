package com.flights.entities;

import java.util.ArrayList;
import java.util.List;

//POJO Class for Flight
public class FlightEntity {
	// Datamembers of FlightEntity
	private Long flightNumber;
	private String flightModel;
	private String carrierName;
	private int seatCapacity;

	// Creating a list
	List<ScheduleFlightEntity> scheduleFlight = new ArrayList<>();

	// Parameterized Constructor
	public FlightEntity(Long flightNumber, String flightModel, String carrierName, int seatCapacity,
			List<ScheduleFlightEntity> scheduleFlight) {
		super();
		this.flightNumber = flightNumber;
		this.flightModel = flightModel;
		this.carrierName = carrierName;
		this.seatCapacity = seatCapacity;
		this.scheduleFlight = scheduleFlight;
	}

	public FlightEntity(Long flightNumber, String flightModel, String carrierName, int seatCapacity) {
		super();
		this.flightNumber = flightNumber;
		this.flightModel = flightModel;
		this.carrierName = carrierName;
		this.seatCapacity = seatCapacity;
	}

	public FlightEntity() {
		super();
	}

	public Long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(Long flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightModel() {
		return flightModel;
	}

	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public List<ScheduleFlightEntity> getScheduleFlight() {
		return scheduleFlight;
	}

	public void setScheduleFlight(List<ScheduleFlightEntity> scheduleFlight) {
		this.scheduleFlight = scheduleFlight;
	}

}
