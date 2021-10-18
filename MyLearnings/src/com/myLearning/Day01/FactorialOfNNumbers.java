package com.myLearning.Day01;

import java.util.Scanner;

public class FactorialOfNNumbers {
	public static void main(String arg[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the value: ");
		int n=scanner.nextInt();
		for(int a=1;a<=n;a++)
		factorial(a);
	}
	static void factorial(int a) {
		int output=1;
		for(int i=1;i<=a;i++)
		{
			output*=i;
		}
		System.out.println("Factorial of "+a+ " is :"+output);
	}
}
