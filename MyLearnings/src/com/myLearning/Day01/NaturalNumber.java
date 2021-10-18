package com.myLearning.Day01;

import java.util.Scanner;

public class NaturalNumber {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many numbers should i print: ");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

}
