package com.example.service;
import java.util.*;

import org.springframework.stereotype.Service;
import com.example.model.Flight;
import com.example.repository.FlightRepository;

@Service
public class FlightService {
	
	private FlightRepository flightRepository;
	
	public FlightService(FlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}
	
	public Flight addFlight(Flight flight) {
		return flightRepository.save(flight);
	}
	
	public List<Flight> getAllFlights() {
		return (List<Flight>) flightRepository.findAll();
	}
	
	public Flight getFlightById(Long id) {
		return flightRepository.findById(id).orElse(null);
	}
	
	public Flight updateFlight(Long id, Flight flight) {
		Flight exists = flightRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Flight not found"));

        exists.setFlightName(flight.getFlightName());
        exists.setSource(flight.getSource());
        exists.setDestination(flight.getDestination());

        return flightRepository.save(exists);
	}
	
	public void deleteFlight(Long id) {
		flightRepository.deleteById(id);
	}
	
//	private List<Flight> flights = new ArrayList<>();
//	
//	public Flight addFlight(Flight flight) {
//		flights.add(flight);
//		return flight;
//	}
//	
//	public List<Flight> getAllFlights() {
//		return flights;
//	}
//	
//	public Flight updateFlight(Long id, Flight updatedFlight) {
//		for(Flight flight : flights) {
//			if(flight.getId().equals(id)) {
//				flight.setFlightName(updatedFlight.getFlightName());
//				flight.setSource(updatedFlight.getSource());
//				flight.setDestination(updatedFlight.getDestination());
//				return flight;
//			}
//		}
//		return null;
//	}
//	
//	public String deleteFlight(Long id) { 
//		flights.removeIf(f -> f.getId().equals(id));
//		return "Flight deleted";
//	}
	

}
 