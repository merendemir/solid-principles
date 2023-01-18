package com.prencible.solid.interface_segregition.without_principle.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cube implements IShape {

    private Double length;

    @Override
    public Double area() {
        return Math.pow(this.getLength(), 2) * 6;
    }

    @Override
    public Double volume() {
        return Math.pow(this.length, 3);
    }
}
