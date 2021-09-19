package com.myLearning.basics;

public class Factors {
	public static void main(String arg[])
	{   int n=91;
		for(int i=1;i<=n;i++) 
		{
		if(n % i == 0)
            System.out.print(i+"\t");
		}
	}
}
	