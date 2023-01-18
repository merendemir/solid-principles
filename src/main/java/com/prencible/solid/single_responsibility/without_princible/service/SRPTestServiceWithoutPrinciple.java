package com.prencible.solid.single_responsibility.without_princible.service;

import com.prencible.solid.single_responsibility.without_princible.model.Circle;
import com.prencible.solid.single_responsibility.without_princible.model.IShape;
import com.prencible.solid.single_responsibility.without_princible.model.Square;
import com.prencible.solid.single_responsibility.without_princible.model.Triangle;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SRPTestServiceWithoutPrinciple {

    private final SRPAreaCalculatorWithoutPrincible SRPAreaCalculatorWithoutPrincible;

//    @PostConstruct
    public void init(){
        IShape square = new Square(10.0);
        IShape circle = new Circle(10.0);
        IShape triangle = new Triangle(5.0, 10.0);

        List<IShape> shapeList = List.of(square, circle, triangle);

        SRPAreaCalculatorWithoutPrincible.calculateTotalAreaAndSendMessageByShapeList(shapeList);
    }
}
