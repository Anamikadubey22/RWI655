package com;
import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1;
		int c;
		for(int i=1;i<=10;i++) {
			c=a+b;
			System.out.println(" "+ c);
			a=b;
			b=c;
		}
	}

}
