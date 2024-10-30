package com.pluralsight;

public class Car extends Vehicle {
    private boolean trunk;
    Car(boolean trunk, boolean gasEngine, int doors, String fourWheelDrive, String towingCapacity, int mileage, String name, double price, int vin){
        super(gasEngine, doors, fourWheelDrive, towingCapacity, mileage, name, price, vin);
        this.trunk = trunk;


    }
}