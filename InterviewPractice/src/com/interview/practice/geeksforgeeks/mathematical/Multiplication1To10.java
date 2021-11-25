package com.interview.practice.geeksforgeeks.mathematical;

import java.util.Scanner;

//Print the multiplication table of a given number N. 

public class Multiplication1To10 {
	static Scanner sc=new Scanner(System.in);
	
	void getTable(int n){
		for(int i=1;i<11;i++)
			System.out.print(n*i+ " ");
	}
	public static void main(String args[]) {
		Multiplication1To10 m=new Multiplication1To10();
		int n=sc.nextInt();
		m.getTable(n);
		
	}

}
