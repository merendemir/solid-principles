package com.prencible.solid.interface_segregition.without_principle.service;

import com.prencible.solid.interface_segregition.without_principle.model.Cube;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ISPTestServiceWithoutPrinciple {

    private final ISPAreaCalculatorWithoutPrinciple ispAreaCalculatorWithoutPrinciple;
    private final ISPVolumeCalculatorWithoutPrinciple ispVolumeCalculatorWithoutPrinciple;

//    @PostConstruct
    public void init(){
        Cube cube = new Cube(10.0);
        System.out.println(ispAreaCalculatorWithoutPrinciple.getTotalAreaByShapeList(List.of(cube)));
        System.out.println(ispVolumeCalculatorWithoutPrinciple.getTotalVolumeByShapeList(List.of(cube)));
    }
}
