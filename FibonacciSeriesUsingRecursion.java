package com;

public class FibonacciSeriesUsingRecursion {
	static int a=0, b=1, c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FibonacciSeriesUsingRecursion ob = new FibonacciSeriesUsingRecursion();
		ob.printFib(10);
	}
	void printFib(int i) {
		if(i>=1) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
			printFib(i-1);
		}
	}
}
