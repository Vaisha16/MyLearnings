package com.myLearnings.Recursion;

import java.util.Scanner;

public class SumOfDigitsRecursion {
	int sum=0,a=0,b=1,i=1;
	void toPrint(int n) {
		if(n>0) {
			sum+=(n%10);
			n/=10;
			toPrint(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigitsRecursion sumofdigit=new SumOfDigitsRecursion();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter positive number: ");
		int n=scanner.nextInt();
		while(n<=0) {
			System.out.println("Enter a Positive Number");
			n=scanner.nextInt();
		}
		System.out.print("Sum of the digits : ");
		sumofdigit.toPrint(n);
		System.out.print(sumofdigit.sum);
	}
}