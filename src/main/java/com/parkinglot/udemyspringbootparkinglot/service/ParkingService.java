package com.parkinglot.udemyspringbootparkinglot.service;

import com.parkinglot.udemyspringbootparkinglot.model.VehicleDTO;

import java.util.List;

public interface ParkingService {

    List<VehicleDTO> getAllVehicles();
    String park(VehicleDTO vehicleDTO);
    String unpark(Long id);
}
