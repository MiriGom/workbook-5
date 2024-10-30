package com.pluralsight;

public class Vehicle extends Transportation {
    protected boolean gasEngine;
    protected String fourWheelDrive;
    protected String towingCapacity;
    protected int mileage;
    protected int doors;


    Vehicle(boolean gasEngine, int doors, String fourWheelDrive, String towingCapacity, int mileage, String name, double price, int vin) {
        super(name, price, vin);
        this.gasEngine = gasEngine;
        this.fourWheelDrive = fourWheelDrive;
        this.towingCapacity = towingCapacity;
        this.mileage = mileage;
        this.doors = doors;
    }

}
