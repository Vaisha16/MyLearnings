package com.myLearning.basics;

import java.util.Scanner;

public class Pattern08 {
	public static void main(String arg[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the pattern size:");
		int size=scan.nextInt();
		int half=size/2;
		if(size%2!=0) {
			for(int i=1;i<=size;i++)
			{	
				for(int j=1;j<=size;j++)
				{	
					if(j==half+1 || i==half+1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println("");
			}scan.close();
		}
	}
}