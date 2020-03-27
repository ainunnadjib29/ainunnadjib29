package com.apap.tu07.service;

import java.util.List;
import java.util.Optional;

import com.apap.tu07.model.FlightModel;

/**
 * FlightService
 */
public interface FlightService {
    FlightModel addFlight(FlightModel flight);
    
    void deleteByFlightNumber(String flightNumber);

    Optional<FlightModel> getFlightDetailByFlightNumber(String flightNumber);

	FlightModel flightById(long id);

	void updateFlight(FlightModel flight);

	void removeFlight(long id);

	List<FlightModel> getAllFlight();

	void updateFlight(String flightNumb, FlightModel flight);

	void deleteFlight(FlightModel flight);
}