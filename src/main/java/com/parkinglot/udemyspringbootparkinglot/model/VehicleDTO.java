package com.parkinglot.udemyspringbootparkinglot.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class VehicleDTO {

    @Id
    private Long id;
    private String vehicleNumber;
    private String ownerName;

}
