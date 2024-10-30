package com.pluralsight;

public class HoverCraft extends Transportation {
    private boolean offGround;

    HoverCraft (boolean offGround, String name, double price, int vin) {
        super(name, price, vin);
        this.offGround = offGround;
    }

    public boolean isOffGround() {
        return offGround;
    }

    public void setOffGround(boolean offGround) {
        this.offGround = offGround;
    }
}
