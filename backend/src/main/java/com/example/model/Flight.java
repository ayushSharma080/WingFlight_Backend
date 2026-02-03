package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String flight_no;       // Flight number
    private String flightName;
    private String source;
    private String destination;
    private String depttime;        // Departure time
    private Integer availableseats; // Available seats
    private Double price;           // Price per seat

    public Flight() {}

    public Flight(Long id, String flight_no, String flightName, String source, String destination,
                  String depttime, Integer availableseats, Double price) {
        this.id = id;
        this.flight_no = flight_no;
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
        this.depttime = depttime;
        this.availableseats = availableseats;
        this.price = price;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFlight_no() { return flight_no; }
    public void setFlight_no(String flight_no) { this.flight_no = flight_no; }

    public String getFlightName() { return flightName; }
    public void setFlightName(String flightName) { this.flightName = flightName; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public String getDepttime() { return depttime; }
    public void setDepttime(String depttime) { this.depttime = depttime; }

    public Integer getAvailableseats() { return availableseats; }
    public void setAvailableseats(Integer availableseats) { this.availableseats = availableseats; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

}
