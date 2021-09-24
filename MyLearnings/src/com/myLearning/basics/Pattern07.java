package com.myLearning.basics;

import java.util.Scanner;

public class Pattern07 {
	public static void main(String arg[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the pattern size:");
		int size=scan.nextInt();
		for(int i=1;i<=size;i++)
		{	
			for(int j=size;j>i;j--)
			{	
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
		}
	}
}
