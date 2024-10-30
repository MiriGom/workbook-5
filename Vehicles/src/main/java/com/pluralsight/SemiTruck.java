package com.pluralsight;

public class SemiTruck extends Vehicle {

    private String bedSize;

    SemiTruck(String bedSize, boolean gasEngine, int doors, String fourWheelDrive, String towingCapacity, int mileage, String name, double price, int vin){
        super(gasEngine, doors, fourWheelDrive, towingCapacity, mileage, name, price, vin);
        this.bedSize = bedSize;
    }
}
