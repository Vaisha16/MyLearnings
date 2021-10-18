package com.myLearning.Day01;

import java.util.Scanner;

public class MultiplesOf3Or5 {
	public static void main(String args[]) {
		int count=0,i=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many numbers should i print: ");
		int n=scanner.nextInt();
		while(count<=n) {
			if(i%3==0 || i%5==0) {
				System.out.print(i+"\t");
				count++;
			}i++;
		}
	}
}
