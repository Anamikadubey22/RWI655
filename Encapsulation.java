package com;

class Student {
    // Private data members
    private String name;
    private int age;
    private double gpa;

    // Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getter methods (to access private data members)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    // Setter methods (to modify private data members)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

// Main class
public class Encapsulation {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student("John Doe", 20, 3.8);

        // Access and display the student's information
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGpa());

        // Modify the student's information
        student.setName("Jane Smith");
        student.setAge(21);
        student.setGpa(4.0);

        // Access and display the updated student's information
        System.out.println("\nUpdated Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGpa());
    }
}