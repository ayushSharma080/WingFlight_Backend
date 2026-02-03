package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Flight;

public interface FlightRepository extends CrudRepository<Flight,Long>{

}
