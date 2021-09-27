package com.myLearning.oops;

public class FactorialProgram {
	public static void main(String arg[]) {
		factorial();
	}
	static void factorial() {
		int input=5,output=1;
		if(input==0)
			System.out.println("Enter a Positive Number");
		for(int i=1;i<=input;i++)
		{
			output*=i;
		}
		System.out.println("Factorial of "+input+ " is :"+output);
	}
}
