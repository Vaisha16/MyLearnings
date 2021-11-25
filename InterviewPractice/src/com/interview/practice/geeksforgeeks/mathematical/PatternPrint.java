package com.interview.practice.geeksforgeeks.mathematical;

import java.util.Scanner;

/*You a given a number N. You need to print the pattern for the given value of N.
for N = 2 the pattern will be 
2 2 1 1
2 1*/

public class PatternPrint {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//while(n>0)
		for(int count=n;count>0;count--) {
			for(int i=n;i>0;i--) {
				for(int j=0;j<count;j++) {
					System.out.print(i+" ");
				}
			}	
			System.out.print("$");
		}
		
	}
}
