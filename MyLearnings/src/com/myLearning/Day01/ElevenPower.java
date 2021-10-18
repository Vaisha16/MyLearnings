package com.myLearning.Day01;

import java.util.Scanner;

public class ElevenPower {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many even numbers should i print: ");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print((int)Math.pow(11,i)+"\t");
		}
	}
}
