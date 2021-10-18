package com.myLearning.Day01;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String args[]) {
		int even=2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many even numbers should i print: ");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(even);
			even+=2;
		}
	}
}
