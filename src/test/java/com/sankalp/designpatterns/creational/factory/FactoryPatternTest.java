package com.sankalp.designpatterns.creational.factory;

import com.sankalp.designpatterns.creational.factory.data.Vehicle;
import com.sankalp.designpatterns.creational.factory.data.VehicleType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryPatternTest {

    @Test
    public void testFactoryPattern(){
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle1 = vehicleFactory.getVehicle("car");
        Vehicle vehicle2 = vehicleFactory.getVehicle("bike");
        assertEquals(VehicleType.CAR, vehicle1.getVehicleType());
        assertEquals(VehicleType.BIKE, vehicle2.getVehicleType());
    }

}
