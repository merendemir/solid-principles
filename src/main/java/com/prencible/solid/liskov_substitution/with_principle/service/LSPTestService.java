package com.prencible.solid.liskov_substitution.with_principle.service;

import com.prencible.solid.liskov_substitution.with_principle.model.Bike;
import com.prencible.solid.liskov_substitution.with_principle.model.Car;
import com.prencible.solid.liskov_substitution.with_principle.model.Vehicle;
import com.prencible.solid.liskov_substitution.with_principle.model.VehicleWithEngine;
import com.prencible.solid.open_close.with_principle.model.Circle;
import com.prencible.solid.open_close.with_principle.model.IShape;
import com.prencible.solid.open_close.with_principle.model.Square;
import com.prencible.solid.open_close.with_principle.model.Triangle;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LSPTestService {

//    @PostConstruct
    public void init() {
        Vehicle bike = new Bike();
        bike.setNumberOfWheels(2);

        this.printVehicleDetails(bike);

        VehicleWithEngine car = new Car();
        car.setEnginePower(1.6);
        car.setNumberOfWheels(4);

        this.printVehicleDetails(car);
    }

    public void printVehicleDetails(Vehicle vehicle) {
        System.out.println(vehicle.getNumberOfWheels());
    }

    public void printVehicleWithEngineDetails(VehicleWithEngine vehicleWithEngine) {
        System.out.println(vehicleWithEngine.getNumberOfWheels());
        System.out.println(vehicleWithEngine.getEnginePower());
    }
}
