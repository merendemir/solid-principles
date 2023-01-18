package com.prencible.solid.interface_segregition.without_principle.service;

import com.prencible.solid.interface_segregition.without_principle.model.IShape;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISPAreaCalculatorWithoutPrinciple {

    public Double getTotalAreaByShapeList(List<IShape> iShapeList) {
        return iShapeList.stream()
                .map(IShape::area)
                .reduce(0.0, Double::sum);
    }
}
