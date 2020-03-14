package com.parkinglot.udemyspringbootparkinglot.controller;

import com.parkinglot.udemyspringbootparkinglot.model.VehicleDTO;
import com.parkinglot.udemyspringbootparkinglot.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parkinglot")
public class ParkingLotController {

    @Autowired
    ParkingService parkingService;

    @GetMapping("/parkinginfo")
    public List<VehicleDTO> getAllVehicles() {
        return parkingService.getAllVehicles();
    }

    @PostMapping("/park")
    public String park(VehicleDTO vehicleDTO) {
        return parkingService.park(vehicleDTO);
    }

    @DeleteMapping("/unpark")
    public String unpark(Long id) {
        return parkingService.unpark(id);
    }

}
