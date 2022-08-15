package com.sankalp.designpatterns.creational.factory;

import com.sankalp.designpatterns.creational.factory.data.Vehicle;
import com.sankalp.designpatterns.creational.factory.data.VehicleType;
import com.sankalp.designpatterns.creational.factory.data.Bike;
import com.sankalp.designpatterns.creational.factory.data.Car;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType){
        vehicleType = vehicleType.toUpperCase();
        if(vehicleType.equals(VehicleType.CAR.name())){
            return new Car();
        }
        else if(vehicleType.equals(VehicleType.BIKE.name())){
            return new Bike();
        }
        return null;
    }

}
