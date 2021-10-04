package com.myLearning.basics;

public class PatternNumber {
	public static void main(String arg[]) {
		int count=0;
		for(int i=0;i<5;i++)
		{	count=i;
			for(int j=5;j>i;j--)
			{
				System.out.print(++count);
			}
			System.out.println("");
		}
	}
}
