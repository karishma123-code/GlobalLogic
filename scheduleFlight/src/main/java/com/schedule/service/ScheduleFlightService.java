package com.schedule.service;

import java.util.List;

import com.schedule.entity.ScheduleFlightEntity;

public interface ScheduleFlightService {
	public List<ScheduleFlightEntity> getScheduleFlightOfFlight(Long flightNumber);

}
