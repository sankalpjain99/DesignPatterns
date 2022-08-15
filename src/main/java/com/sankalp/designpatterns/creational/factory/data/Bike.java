package com.sankalp.designpatterns.creational.factory.data;

import com.sankalp.designpatterns.creational.factory.data.Vehicle;
import com.sankalp.designpatterns.creational.factory.data.VehicleType;

public class Bike implements Vehicle {
    @Override
    public VehicleType getVehicleType() {
        return VehicleType.BIKE;
    }
}
