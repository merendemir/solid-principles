package com.prencible.solid.interface_segregition.with_principle.service;

import com.prencible.solid.interface_segregition.with_principle.model.Cube;
import com.prencible.solid.interface_segregition.with_principle.model.IShape;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ISPTestService {

    private final ISPAreaCalculator ispAreaCalculator;
    private final ISPVolumeCalculator ispVolumeCalculator;

//    @PostConstruct
    public void init(){
        Cube cube = new Cube(10.0);
        System.out.println(ispAreaCalculator.getTotalAreaByShapeList(List.of(cube)));
        System.out.println(ispVolumeCalculator.getTotalVolumeByShapeList(List.of(cube)));
    }
}
