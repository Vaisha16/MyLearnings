package com.myLearning.Day01;

import java.util.Scanner;

public class AddingFirstNNumber {
	public static void main(String args[]) {
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.print(sum+"\t");
	}
}
