package com.prencible.solid.open_close.without_principle.service;

import com.prencible.solid.open_close.without_principle.model.Circle;
import com.prencible.solid.open_close.without_principle.model.Square;
import com.prencible.solid.open_close.without_principle.model.Triangle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OCPWithoutPrincipleService {

    private final OCPAreaCalculatorWithoutPrinciple OCPAreaCalculatorWithoutPrinciple;

//    @PostConstruct
    public void init(){
        Square square = new Square(10.0);
        Circle circle = new Circle(10.0);
        Triangle triangle = new Triangle(5.0, 10.0);

        List<Object> objectList = List.of(square, circle, triangle);

        System.out.println(OCPAreaCalculatorWithoutPrinciple.getTotalAreaByShapeList(objectList));
    }
}
