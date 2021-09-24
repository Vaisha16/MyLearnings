package com.myLearning.basics;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String arg[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the pattern size:");
		int size=scan.nextInt();
		int a=1;
		for(int i=1;i<=size;i++)
		{
			for(int j=0;j<i;j++)
			{	
				System.out.print(a+" ");
				a+=2;
			}
			System.out.println("");
			System.out.print("");
		}
	}
}
