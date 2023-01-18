package com.prencible.solid.single_responsibility.with_principle.model;

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
}
