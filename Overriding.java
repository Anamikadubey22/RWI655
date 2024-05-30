package com.example1;
class Test1 {
	void show() {
		System.out.println("1");
	}
}
class xyz extends Test1{
	void show() {
		System.out.println("2");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t= new Test1();
		t.show();
	}

}
