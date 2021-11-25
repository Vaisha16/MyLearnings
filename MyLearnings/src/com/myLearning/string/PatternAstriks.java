package com.myLearning.string;

import java.util.Scanner;

public class PatternAstriks {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the pattern size:");
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=n-1;j>=i;j--)
				System.out.print(" ");
			
			for(int k=1;k<=i;k++)
				System.out.print("*");
			
			for(int m=1;m<=i-1;m++)
				System.out.print("*");
			
			System.out.println();
		}scan.close();
	}
}
