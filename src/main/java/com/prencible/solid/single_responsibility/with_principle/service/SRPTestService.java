package com.prencible.solid.single_responsibility.with_principle.service;

import com.prencible.solid.single_responsibility.with_principle.model.Circle;
import com.prencible.solid.single_responsibility.with_principle.model.IShape;
import com.prencible.solid.single_responsibility.with_principle.model.Square;
import com.prencible.solid.single_responsibility.with_principle.model.Triangle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SRPTestService {

    private final SRPAreaCalculator SRPAreaCalculator;

    private final SRPNotificationService SRPNotificationService;

//    @PostConstruct
    public void init(){
        IShape square = new Square(10.0);
        IShape circle = new Circle(10.0);
        IShape triangle = new Triangle(5.0, 10.0);

        List<IShape> shapeList = List.of(square, circle, triangle);

        Double totalArea = SRPAreaCalculator.getTotalAreaByShapeList(shapeList);
        SRPNotificationService.sendMessage(totalArea.toString());
    }
}
