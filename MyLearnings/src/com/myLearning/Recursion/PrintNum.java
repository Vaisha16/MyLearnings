package com.myLearning.Recursion;

import java.util.Scanner;

public class PrintNum {
	int count=0;
	void toPrint(int n) {
		if(count<n) {
			System.out.println(++count);
			toPrint(n);
		}
	}

	public static void main(String[] args) {
		PrintNum num=new PrintNum();
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number: ");
		num.toPrint(scanner.nextInt());
		scanner.close();
	}

}
