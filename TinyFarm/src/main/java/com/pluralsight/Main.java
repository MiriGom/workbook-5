package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();

        Dog myDog = new Dog();
        myDog.eat(3);
        myDog.eat();

        Cat myCat = new Cat();
        myCat.eat();


    }
}
