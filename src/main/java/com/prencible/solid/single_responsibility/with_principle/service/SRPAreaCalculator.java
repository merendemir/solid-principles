package com.prencible.solid.single_responsibility.with_principle.service;

import com.prencible.solid.single_responsibility.with_principle.model.IShape;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SRPAreaCalculator {

    public Double getTotalAreaByShapeList(List<IShape> iShapeList) {
        return iShapeList.stream()
                .map(IShape::area)
                .reduce(0.0, Double::sum);
    }
}
