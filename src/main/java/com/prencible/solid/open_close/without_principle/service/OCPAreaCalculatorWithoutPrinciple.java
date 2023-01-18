package com.prencible.solid.open_close.without_principle.service;

import com.prencible.solid.open_close.without_principle.model.Circle;
import com.prencible.solid.open_close.without_principle.model.Square;
import com.prencible.solid.open_close.without_principle.model.Triangle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OCPAreaCalculatorWithoutPrinciple {

    public Double getTotalAreaByShapeList(List<Object> objectList) {
        double sum = 0.0;

        for (Object object : objectList) {
            if (object instanceof Circle) {
                Double radius = ((Circle) object).getRadius();
                sum += Math.PI * Math.pow(radius, 2);
            } else if (object instanceof Square) {
                Double length = ((Square) object).getLength();
                sum += Math.pow(length, 2);
            } else if (object instanceof Triangle) {
                Double height = ((Triangle) object).getHeight();
                Double length = ((Triangle) object).getLength();

                sum += (height * length) / 2;
            }
        }

        return sum;
    }
}
