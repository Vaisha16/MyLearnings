package com.myLearning.basics;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		System.out.println("*");
		
		//upper triangle print n rows
		for(int i=1;i<=n;i++) {
			System.out.print("*");
			for(int k=1;k<=i;k++) {
				System.out.print(k);
				a=k;
			}
			for(int m=1;m<=i-1;m++) {
				System.out.print(--a);
			}System.out.print("*");
			System.out.println();
		}
		// lower triangle print n-1 rows
		for(int i=n-1;i>0;i--) {
			a=0;
			System.out.print("*");
			for(int j=i;j>0;j--) {
				System.out.print(++a);
			}
			for(int k=i-1;k>0;k--) {
				System.out.print(--a);
			}System.out.print("*");
			System.out.println();
		}
		System.out.println("*");
		sc.close();
	}
}


