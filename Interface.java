package com.example1;
//Interface
interface Flyable {
 void fly();
}

//Class implementing the interface
class Bird implements Flyable {
 @Override
 public void fly() {
     System.out.println("The bird is flying.");
 }
}

//Another class implementing the interface
class Airplane implements Flyable {
 @Override
 public void fly() {
     System.out.println("The airplane is flying.");
 }
}

public class Interface {
 public static void main(String[] args) {
     Flyable bird = new Bird();
     Flyable airplane = new Airplane();

     bird.fly(); // Output: The bird is flying.
     airplane.fly(); // Output: The airplane is flying.

     flyObject(bird); // Output: The bird is flying.
     flyObject(airplane); // Output: The airplane is flying.
 }

 public static void flyObject(Flyable obj) {
     obj.fly();
 }
}