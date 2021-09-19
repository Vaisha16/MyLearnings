package com.myLearning.basics;

public class Pattern04 {
	public static void main(String arg[]){
		for (int i=4;i>0;i--)
        {
            for (int j=2;j<=i;j++)
            {
                System.out.print(" ");
            }

            for (int k=i;k<=4;k++)
            {
                System.out.print("*");
            }
            System.out.println();
		}
	}
}
