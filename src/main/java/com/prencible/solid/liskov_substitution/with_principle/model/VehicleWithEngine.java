package com.prencible.solid.liskov_substitution.with_principle.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleWithEngine extends Vehicle {
    Double enginePower;
}
