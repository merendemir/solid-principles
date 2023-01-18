package com.prencible.solid.liskov_substitution.without.principle.service;

import com.prencible.solid.liskov_substitution.without.principle.model.Bike;
import com.prencible.solid.liskov_substitution.without.principle.model.Vehicle;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LSPTestServiceWithoutPrinciple {

//    @PostConstruct
    public void init() {
        Vehicle bike = new Bike();
        bike.setNumberOfWheels(2);

        this.printVehicleWithEngineDetails(bike);
    }

        /**
         * engine info will be null for bike
         * because bike has no engine,
         * so we shouldn't extend bike from vehicle
         */
    public void printVehicleWithEngineDetails(Vehicle vehicle) {
        System.out.println(vehicle.getNumberOfWheels());
        System.out.println(vehicle.getEnginePower());
    }
}
