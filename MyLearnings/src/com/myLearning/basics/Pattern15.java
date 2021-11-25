package com.myLearning.basics;

import java.util.Scanner;

public class Pattern15 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the pattern size:");
		int n=scan.nextInt();
		int b=0;
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}int a=i-1;
			for(int k=1;k<=i;k++) {
				a++;
				System.out.print(a);
			}b=a-1;
			for(int m=1;m<=i-1;m++) {
				
				System.out.print(b--);
			}
			System.out.println();
		}scan.close();
	}
}
