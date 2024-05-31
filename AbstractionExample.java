package com.example1;

//Abstract class
abstract class Shape {
 String color;

 // Constructor
 Shape(String color) {
     this.color = color;
 }

 // Abstract method
 abstract double area();

 // Concrete method
 public String getColor() {
     return color;
 }
}

//Concrete class extending the abstract class
class Circle extends Shape {
 double radius;

 // Constructor
 Circle(String color, double radius) {
     super(color); // Calling the base class constructor
     this.radius = radius;
 }

 // Implementing the abstract method
 @Override
 double area() {
     return Math.PI * radius * radius;
 }
}

//Another concrete class extending the abstract class
class Rectangle extends Shape {
 double length;
 double width;

 // Constructor
 Rectangle(String color, double length, double width) {
     super(color); // Calling the base class constructor
     this.length = length;
     this.width = width;
 }

 // Implementing the abstract method
 @Override
 double area() {
     return length * width;
 }
}

public class AbstractionExample {
 public static void main(String[] args) {
     // Creating objects of concrete classes
     Shape circle = new Circle("Red", 5.0);
     Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

     System.out.println("Circle color: " + circle.getColor());
     System.out.println("Circle area: " + circle.area());

     System.out.println("\nRectangle color: " + rectangle.getColor());
     System.out.println("Rectangle area: " + rectangle.area());
 }
}