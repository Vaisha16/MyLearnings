package com.myLearning.Day01;

import java.util.Scanner;

public class FactorialProgram {
	public static void main(String arg[]) {
		factorial();
	}
	static void factorial() {
		int input,output=1;
		Scanner scanner=new Scanner(System.in);
		input=scanner.nextInt();
		if(input==0)
			System.out.println("Enter a Positive Number");
		for(int i=1;i<=input;i++)
		{
			output*=i;
		}
		System.out.println("Factorial of "+input+ " is :"+output);
	}
}
