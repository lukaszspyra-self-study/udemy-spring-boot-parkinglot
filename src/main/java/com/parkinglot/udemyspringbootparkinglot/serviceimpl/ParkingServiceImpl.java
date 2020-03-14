package com.parkinglot.udemyspringbootparkinglot.serviceimpl;

import com.parkinglot.udemyspringbootparkinglot.model.VehicleDTO;
import com.parkinglot.udemyspringbootparkinglot.repository.ParkingRepository;
import com.parkinglot.udemyspringbootparkinglot.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService {

    @Autowired
    ParkingRepository parkingRepository;

    @Override
    public List<VehicleDTO> getAllVehicles() {
        return parkingRepository.findAll();
    }

    @Override
    public String park(VehicleDTO vehicleDTO) {
        if (vehicleDTO.getId() > 0 && vehicleDTO.getId() < 11){
            parkingRepository.save(vehicleDTO);
        } else {
            throw new RuntimeException("Kindly provide ID from 1 to 10");
        }
        return "Parked";
    }

    @Override
    public String unpark(Long id) {
        if (id > 0 && id < 11){
            parkingRepository.deleteById(id);
        } else {
            throw new RuntimeException("Kindly provide ID from 1 to 10");
        }
        return "Unparked vehicle at slot number" + id;
    }
}
