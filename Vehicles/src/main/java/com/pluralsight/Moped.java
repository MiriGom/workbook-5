package com.pluralsight;

public class Moped extends Vehicle {
    private boolean under50Ccs;

     Moped(boolean under50Ccs ,boolean gasEngine, int doors, String fourWheelDrive, String towingCapacity, int mileage, String name, double price, int vin){
        super(gasEngine, doors, fourWheelDrive, towingCapacity, mileage, name, price, vin);
        this.under50Ccs = under50Ccs;
    }
}
