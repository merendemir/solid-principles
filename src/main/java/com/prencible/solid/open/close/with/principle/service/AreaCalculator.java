package com.prencible.solid.open.close.with.principle.service;

import com.prencible.solid.open.close.with.principle.model.IShape;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaCalculator {

    public Double getTotalAreaByShapeList(List<IShape> iShapeList) {
        return iShapeList.stream()
                .map(IShape::area)
                .reduce(0.0, Double::sum);
    }
}
