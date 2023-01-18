package com.prencible.solid.interface_segregition.with_principle.service;

import com.prencible.solid.interface_segregition.with_principle.model.ThreeDimensionalShape;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISPVolumeCalculator {

    public Double getTotalVolumeByShapeList(List<ThreeDimensionalShape> threeDimensionalShapeList) {
        return threeDimensionalShapeList.stream()
                .map(ThreeDimensionalShape::volume)
                .reduce(0.0, Double::sum);
    }
}
