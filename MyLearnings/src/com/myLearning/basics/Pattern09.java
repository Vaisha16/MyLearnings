package com.myLearning.basics;

import java.util.Scanner;

public class Pattern09 {
	public static void main(String arg[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the pattern size:");
		int size=scan.nextInt();
		int a=0;
		for(int i=1;i<=size;i++)
		{
			for(int j=0;j<i;j++)
			{	a++;
				System.out.print(a+" ");
			}
			System.out.println("");
			System.out.print("");
		}
	}
}
