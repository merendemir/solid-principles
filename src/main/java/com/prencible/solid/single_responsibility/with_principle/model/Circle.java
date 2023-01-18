package com.prencible.solid.single_responsibility.with_principle.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Circle implements IShape {

    private Double radius;

    @Override
    public Double area() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
}
