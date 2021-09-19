package com.myLearning.basics;

public class DoWhileLoop {
	public static void main(String arg[]) {
		int i=1;
		do{
			int j=1;
			do {
				if(j<=i)
				System.out.print("* ");
				else
					System.out.print(" ");
				j++;
			} while(j<=5);
			System.out.println();
			i++;
		}while(i<=5);
	}
}
