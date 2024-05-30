package com;

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car start with key ");
    }
}

class Scooter extends Vehicle {
    @Override
    void start() {
        System.out.println("Scooter starts with kick");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();

        Scooter s = new Scooter();
        s.start();
    }
}
