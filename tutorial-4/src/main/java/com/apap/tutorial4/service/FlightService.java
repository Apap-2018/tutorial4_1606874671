package com.apap.tutorial4.service;

import java.util.List;

import com.apap.tutorial4.model.FlightModel;

/**
 * FlightService
 * @author Muhammad Aulia Adil
 *
 */
public interface FlightService {
	
	void addFlight(FlightModel flight);
	void deleteFlight(FlightModel flight);
	FlightModel getFlightDetailById(String id);
	List<FlightModel> getAllFlight();
}
