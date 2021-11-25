package com.myLearning.Recursion;

import java.util.Scanner;

public class FibonacciRecursion {
	int fib=0,a=0,b=1,i=1;
	void toPrint(int n) {
		if(i<=n) {
			fib+=a;
			a=b;
			b=fib;
			i++;
			System.out.print(fib+"\t");
			toPrint(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciRecursion fibonacci=new FibonacciRecursion();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter positive number: ");
		int n=scanner.nextInt();
		while(n<=0) {
			System.out.println("Enter a Positive Number");
			n=scanner.nextInt();
		}
		System.out.print("Fibonacci series : "+n+" is: ");
		fibonacci.toPrint(n);
		scanner.close();
	}
}

