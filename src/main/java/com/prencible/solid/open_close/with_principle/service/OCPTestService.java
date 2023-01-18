package com.prencible.solid.open_close.with_principle.service;

import com.prencible.solid.open_close.with_principle.model.Circle;
import com.prencible.solid.open_close.with_principle.model.IShape;
import com.prencible.solid.open_close.with_principle.model.Square;
import com.prencible.solid.open_close.with_principle.model.Triangle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OCPTestService {

    private final OCPAreaCalculator OCPAreaCalculator;

//    @PostConstruct
    public void init(){
        IShape square = new Square(10.0);
        IShape circle = new Circle(10.0);
        IShape triangle = new Triangle(5.0, 10.0);

        List<IShape> shapeList = List.of(square, circle, triangle);

        System.out.println(OCPAreaCalculator.getTotalAreaByShapeList(shapeList));
    }
}
