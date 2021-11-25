package com.myLearning.Day01;

import java.util.Scanner;

public class PrimeNumberPrinting {
	int count=0;
	boolean prime=true;
	
	void isPrime(int n) {
		if(n==2||n==3) {
			System.out.print(n+"\t");
			count++;
		}
		else 
		{
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					prime=false;
					}
				}
			if(prime) {
				System.out.print(n+"\t");
				count++;
			}
		}prime=true;
	}
	public static void main(String args[]) {
		int i=2;
		PrimeNumberPrinting p=new PrimeNumberPrinting();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=scanner.nextInt();
		while(p.count<n) {
			p.isPrime(i);
			i++;
			if(p.count%10==0) System.out.println();
		}scanner.close();
	}
}
