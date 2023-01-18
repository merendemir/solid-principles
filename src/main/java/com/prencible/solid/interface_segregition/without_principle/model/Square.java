package com.prencible.solid.interface_segregition.without_principle.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Square implements IShape {

    private Double length;

    @Override
    public Double area() {
        return Math.pow(this.getLength(), 2) ;
    }

    /**
     * this is broke the principle because square is can not have the volume
     */
    @Override
    public Double volume() {
        return 0.0;
    }
}
