package com.prencible.solid.interface_segregition.without_principle.service;

import com.prencible.solid.interface_segregition.without_principle.model.IShape;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISPVolumeCalculatorWithoutPrinciple {

    public Double getTotalVolumeByShapeList(List<IShape> threeDimensionalShapeList) {
        return threeDimensionalShapeList.stream()
                .map(IShape::volume)
                .reduce(0.0, Double::sum);
    }
}
