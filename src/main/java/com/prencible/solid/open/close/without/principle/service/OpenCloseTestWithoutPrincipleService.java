package com.prencible.solid.open.close.without.principle.service;

import com.prencible.solid.open.close.without.principle.model.Circle;
import com.prencible.solid.open.close.without.principle.model.Square;
import com.prencible.solid.open.close.without.principle.model.Triangle;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OpenCloseTestWithoutPrincipleService {

    private final AreaCalculatorWithoutPrinciple areaCalculatorWithoutPrinciple;

//    @PostConstruct
    public void init(){
        Square square = new Square(10.0);
        Circle circle = new Circle(10.0);
        Triangle triangle = new Triangle(5.0, 10.0);

        List<Object> objectList = List.of(square, circle, triangle);

        System.out.println(areaCalculatorWithoutPrinciple.getTotalAreaByShapeList(objectList));
    }
}
