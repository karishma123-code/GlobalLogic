package com.schedule.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.schedule.entity.ScheduleFlightEntity;
@Service
public class ScheduleFlightImpl implements ScheduleFlightService {
	
	List<ScheduleFlightEntity> list=List.of(new ScheduleFlightEntity(50,"9:30 AM",101L),
			new ScheduleFlightEntity(20,"20:45 PM",102L),
			new ScheduleFlightEntity(70,"16:30 AM",103L));
	@Override
	public List<ScheduleFlightEntity> getScheduleFlightOfFlight(Long flightNumber) {
		return list.stream().filter(scheduleFlight->scheduleFlight.getFlightNumber()
				.equals(flightNumber)).collect(Collectors.toList());
	}

}
