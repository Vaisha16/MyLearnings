package com.myLearning.Day01;

import java.util.Scanner;

public class ConsecutiveNumberMultiply {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many numbers should i print: ");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i*(i+1)+"\t");
		}scanner.close();
	}
}
