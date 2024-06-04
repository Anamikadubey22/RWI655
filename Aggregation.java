package june4;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

class Course {
    private String name;
    private List<Student> enrolledStudents;
    
    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }
    
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }
    
    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }
    
    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("John", 20);
        Student student2 = new Student("Jane", 22);
        
        // Create course object
        Course course = new Course("Java Programming");
        
        // Enroll students in the course
        course.enrollStudent(student1);
        course.enrollStudent(student2);
        
        // Get the list of enrolled students
        List<Student> enrolledStudents = course.getEnrolledStudents();
        
        // Print the enrolled students
        System.out.println("Enrolled students:");
        for (Student student : enrolledStudents) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
        
        // Remove a student from the course
        course.removeStudent(student1);
        
        // Print the updated list of enrolled students
        System.out.println("\nUpdated enrolled students:");
        enrolledStudents = course.getEnrolledStudents();
        for (Student student : enrolledStudents) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}