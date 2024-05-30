package com.example1;
class Test {
	void show() {
		System.out.println("1");
	}
	void show(int a) {
		System.out.println("2");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.show(10);

	}

}
