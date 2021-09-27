package com.myLearnings.Recursion;

import java.util.Scanner;

public class Factorial {
	int fact=1,i=1;
	void toPrint(int n) {
		if(i<=n) {
			fact*=i;
			i++;
			toPrint(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial num=new Factorial();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter positive number: ");
		int n=scanner.nextInt();
		while(n<=0) {
			System.out.println("Enter a Positive Number");
			n=scanner.nextInt();
		}
		num.toPrint(n);
		System.out.println("The Factorial of "+n+" is: "+num.fact);
	}
}

