package com.myLearning.Day01;

import java.util.Scanner;

public class PrintingOne {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many times should i print: ");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println(1);
		}scanner.close();
	}

}
