package com.UST.Flightservices.dto;

import com.UST.Flightservices.entity.Passangerinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class FlightBookingAcknowledgement {
    private String Status;
    private double amount;
    private String name;
    private String pnrno;
    private Passangerinfo passengerinfo;



}
