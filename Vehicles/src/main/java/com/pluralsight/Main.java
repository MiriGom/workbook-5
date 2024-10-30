package com.pluralsight;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        HoverCraft board1 = new HoverCraft(true, "Hover Board", 20, 1234);
        System.out.println("Price is $" + board1.price + "\nVin number is " + board1.vin + "\nis it off the ground? " + board1.isOffGround());

        Car car = new Car(true, true, 2, "2-wheel drive", "can tow up to 500lbs", 177000, "sports car", 8000, 7987);
        System.out.println("\nThis car has " + car.doors + " doors. \nthis car's vin number is " + car.vin + ".\nThis car is a " + car.fourWheelDrive);
    }
}
