package com.parkinglot.udemyspringbootparkinglot.repository;

import com.parkinglot.udemyspringbootparkinglot.model.ParkingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<ParkingInfo, Long> {
}
