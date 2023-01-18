package com.prencible.solid.open.close.with.principle.service;

import com.prencible.solid.open.close.with.principle.model.Circle;
import com.prencible.solid.open.close.with.principle.model.IShape;
import com.prencible.solid.open.close.with.principle.model.Square;
import com.prencible.solid.open.close.with.principle.model.Triangle;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OpenCloseTestService {

    private final AreaCalculator areaCalculator;

//    @PostConstruct
    public void init(){
        IShape square = new Square(10.0);
        IShape circle = new Circle(10.0);
        IShape triangle = new Triangle(5.0, 10.0);

        List<IShape> shapeList = List.of(square, circle, triangle);

        System.out.println(areaCalculator.getTotalAreaByShapeList(shapeList));
    }
}
