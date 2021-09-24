package com.myLearning.basics;

import java.util.Scanner;

public class Pattern02 {
	public static void main(String arg[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the pattern size:");
		int size=scan.nextInt();
		for(int i=0;i<size;i++)
		{	
			for(int j=0;j<i;j++)
			{	
				System.out.print(" ");
			}
			for(int k=size;k>i;k--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
