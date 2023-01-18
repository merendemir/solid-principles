package com.prencible.solid.open_close.with_principle.service;

import com.prencible.solid.open_close.with_principle.model.IShape;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OCPAreaCalculator {

    public Double getTotalAreaByShapeList(List<IShape> iShapeList) {
        return iShapeList.stream()
                .map(IShape::area)
                .reduce(0.0, Double::sum);
    }
}
