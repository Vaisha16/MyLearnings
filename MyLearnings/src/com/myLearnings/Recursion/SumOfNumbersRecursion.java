package com.myLearnings.Recursion;

import java.util.Scanner;

public class SumOfNumbersRecursion {
	int sum=0,a=1;
	void toPrint(int n) {
		if(a<=n) {
			sum+=a;
			a++;
			toPrint(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumbersRecursion sumofnum=new SumOfNumbersRecursion();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter positive number: ");
		int n=scanner.nextInt();
		while(n<=0) {
			System.out.println("Enter a Positive Number");
			n=scanner.nextInt();
		}
		System.out.print("Sum of the Numbers : ");
		sumofnum.toPrint(n);
		System.out.print(sumofnum.sum);
	}
}