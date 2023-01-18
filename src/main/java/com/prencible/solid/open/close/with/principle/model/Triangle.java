package com.prencible.solid.open.close.with.principle.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Triangle implements IShape{

    private Double height;

    private Double length;

    @Override
    public Double area() {
        return (this.getLength() * this.getHeight()) / 2;
    }
}
