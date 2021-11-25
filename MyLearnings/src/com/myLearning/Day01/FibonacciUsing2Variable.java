package com.myLearning.Day01;

import java.util.Scanner;

public class FibonacciUsing2Variable {
	public static void main(String args[]) {
		int a=0,b=1,n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			a=a+b;
			b=a-b;
		}scanner.close();
	}
}
