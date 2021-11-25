package com.myLearning.Day01;

import java.util.Scanner;

public class AddingNumber {
	public static void main(String args[]) {
		int sum=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many numbers should i print: ");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(sum+"\t");
			sum+=i;
		}scanner.close();
	}
}
