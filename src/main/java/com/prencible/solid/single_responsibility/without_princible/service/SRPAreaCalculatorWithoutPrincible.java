package com.prencible.solid.single_responsibility.without_princible.service;

import com.prencible.solid.single_responsibility.without_princible.model.IShape;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SRPAreaCalculatorWithoutPrincible {

    public void calculateTotalAreaAndSendMessageByShapeList(List<IShape> iShapeList) {
        Double totalArea = iShapeList.stream()
                .map(IShape::area)
                .reduce(0.0, Double::sum);

        System.out.println("Message sent. message: " + totalArea);
    }
}
