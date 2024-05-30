package com.example1;
class Employee{
	String name;
	int emp_id;
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		System.out.println("Employee1 : "+ e1.name + " "+e1.emp_id);
		System.out.println("Employee2 : "+ e2.name + " "+e2.emp_id);
	}

}
