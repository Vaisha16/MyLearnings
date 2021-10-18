package com.myLearning.Day01;

import java.util.Scanner;

public class OddNumber {
	public static void main(String args[]) {
		int odd=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many odd numbers should i print: ");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(odd);
			odd+=2;
		}
	}
}
