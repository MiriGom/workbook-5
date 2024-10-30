package com.pluralsight;


public class Unicycle extends Transportation {
    private boolean oneSeat;
    private boolean oneWheel;

    Unicycle(boolean oneSeat, boolean oneWheel, String name, double price, int vin) {
        super(name, price, vin);
        this.oneSeat = oneSeat;
        this.oneWheel = oneWheel;

    }
}
