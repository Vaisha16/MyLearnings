package com.myLearning.Day01;

import java.util.Scanner;

public class PrimeNumber {
	void isPrime(int n) {
		if(n==0||n==1) {
			System.out.println(n+" is a neither a prime number nor a composite number");
		}
		else if(n==2||n==3) {
			System.out.println(n+" is a prime number");
		}
		else {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(n+" is not a prime number");
				break;
			}
			else {
				System.out.println(n+" is a prime number");
				break;
			}
			
		}
	}
}
	public static void main(String args[]) {
		PrimeNumber p=new PrimeNumber();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=scanner.nextInt();
		p.isPrime(n);
	}
}
