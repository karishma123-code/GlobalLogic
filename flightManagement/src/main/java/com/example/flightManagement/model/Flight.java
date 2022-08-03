package com.example.flightManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//POJO Class of Flight

@Entity   //It specifies that a class is an entity and mapped to a database table
@Table(name="flight")
public class Flight {
	//data members
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //automatic id generation
	private long flightNumber;
	
	@Column(name="flightmodel")
	private String flightModel;
	
	@Column(name="carriername")
	private String carrierName;
	
	@Column(name="seatcapacity")
	private int seatCapacity;
    
	//Default constructor
	public Flight() {
		super();
	}
   
	//Parameterized Constructor
	public Flight(long flightNumber, String flightModel, String carrierName, int seatCapacity) {
		super();
		this.flightNumber = flightNumber;
		this.flightModel = flightModel;
		this.carrierName = carrierName;
		this.seatCapacity = seatCapacity;
	}
	
	//Getter and Setter methods
	public long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(long flightNumber) {
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
	
	}
