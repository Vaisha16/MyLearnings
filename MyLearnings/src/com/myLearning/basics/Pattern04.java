package com.myLearning.basics;

import java.util.Scanner;

public class Pattern04 {
	public static void main(String arg[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the pattern size:");
		int size=scan.nextInt();
		for (int i=size;i>0;i--)
        {
            for (int j=2;j<=i;j++)
            {
                System.out.print(" ");
            }

            for (int k=i;k<=size;k++)
            {
                System.out.print("*");
            }
            System.out.println();
		}
	}
}
