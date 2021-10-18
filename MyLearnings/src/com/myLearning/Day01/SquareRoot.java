package com.myLearning.Day01;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String args[]) {
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to calculate square root: ");
		n=scanner.nextInt();
		System.out.print("The square root of "+n+" is: "+Math.sqrt(n));
	}
}
