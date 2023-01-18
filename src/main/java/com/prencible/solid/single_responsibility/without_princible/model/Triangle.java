package com.prencible.solid.single_responsibility.without_princible.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Triangle implements IShape {

    private Double height;

    private Double length;

    @Override
    public Double area() {
        return (this.getLength() * this.getHeight()) / 2;
    }
}
