package com.myLearning.basics;

import java.util.Scanner;

public class Pattern03 {
	public static void main(String arg[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the pattern size:");
		int size=scan.nextInt();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<i+1;j++)
			{	
				System.out.print("*");
			}
			System.out.println("");
			System.out.print("");
		}scan.close();
	}
}
