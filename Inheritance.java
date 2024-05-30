package com.example1;


//Base class
class Animal {
 String name;

 public Animal(String name) {
     this.name = name;
 }

 public void eat() {
     System.out.println(name + " is eating.");
 }
}

//Derived class
class Dog extends Animal {
 public Dog(String name) {
     super(name); // Call the base class constructor
 }

 public void bark() {
     System.out.println(name + " is barking.");
 }
}

//Another derived class
class Cat extends Animal {
 public Cat(String name) {
     super(name); // Call the base class constructor
 }

 public void meow() {
     System.out.println(name + " is meowing.");
 }
}

public class Inheritance {
 public static void main(String[] args) {
     Animal animal = new Animal("Charlie");
     animal.eat(); // Output: Charlie is eating.

     Dog dog = new Dog("Buddy");
     dog.eat(); // Output: Buddy is eating.
     dog.bark(); // Output: Buddy is barking.

     Cat cat = new Cat("Whiskers");
     cat.eat(); // Output: Whiskers is eating.
     cat.meow(); // Output: Whiskers is meowing.
 }
}