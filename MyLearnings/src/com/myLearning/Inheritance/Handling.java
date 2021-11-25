package com.myLearning.Inheritance;

public class Handling /*implements Throwable */{

public static void main(String args[]) {
	int a[]= {1,2};
	int i=2;
	
	try {
	System.out.println(a[i]/0);	
	}
	catch (ArithmeticException e) {
		System.out.println("Exception catch block");
	}
	catch (Exception e) {
		System.out.println("Exception catch block");
	}
	System.out.println("end");		
	}
	
}
