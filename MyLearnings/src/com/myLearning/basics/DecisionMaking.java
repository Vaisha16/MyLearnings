package com.myLearning.basics;

public class DecisionMaking {
	public static void main(String arg[]) {
		int n=2;
		/*if(n>0)
			System.out.println("POSITIVE");
		else if(n<0)
			System.out.println("NEGATIVE");
		else
			System.out.println("ZERO");*/
		if(n>0)
		{
			n++;
		}
		if(n<2)
		{
			n++;
		}
		System.out.println(n++);
		System.out.println(n);
	}
}
