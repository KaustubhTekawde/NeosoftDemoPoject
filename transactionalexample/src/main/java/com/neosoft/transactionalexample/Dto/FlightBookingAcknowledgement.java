package com.neosoft.transactionalexample.Dto;

import com.neosoft.transactionalexample.Entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FlightBookingAcknowledgement {
    private  String status;
    private double totalFare;
    private  String pnrNo;
    private PassengerInfo passengerInfo;

//    public FlightBookingAcknowledgement(String success, double fare, String s, PassengerInfo passengerInfo) {
//    }
}
