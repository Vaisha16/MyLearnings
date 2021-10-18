package com.myLearning.Day01;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		int a=0,b=1,c=0,n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=scanner.nextInt();
		for(int i=1;i<=n;i++) {
			c+=a;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}
