package com.myLearning.basics;

public class SwitchStatement {
	public static void main(String arg[]){
		int a=5;
		int r=a%2;
		switch(r)
		{
		case 0:
			System.out.println("EVEN");
			//break;
		case 1:
			System.out.println("ODD");
			//sbreak;
		default:
			System.out.println("This is default case");
		}
	}
}
