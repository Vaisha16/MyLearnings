package com.myLearning.Day01;

import java.util.Scanner;

public class OddEven {
	public static void main(String args[]) {
		int even=2,odd=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many numbers should i print: ");
		int n=scanner.nextInt();
		for(int i=1;i<=n/2;i++) {
			System.out.print(odd+"\t");
			odd+=2;
		}
		for(int i=n/2;i<n;i++) {
			System.out.print(even+"\t");
			even+=2;
		}scanner.close();
	}
}
