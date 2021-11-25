package com.myLearning.testPrograms;

import java.util.Scanner;

public class FibonacciPattern230921 {
	int row,size,count=0;
	int a=0,b=1,temp;
	
	FibonacciPattern230921() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the pattern size: ");
		row=scan.nextInt();
		for(int m=1;m<=row;m++) {
			size=size+((m*2)-1);
		}
		scan.close();
	}
	void getFibonacci(int[] series) {
		for(int i=0;i<size;i++) {
				series[i]=a;
				temp=a;
				a=b;
				b=temp+a;
		}
	}
	
	void toPrint(int[] series) {
		for(int i=1;i<=row;i++) {
			for(int j=row-1;j>=i;j--) {
				System.out.print("\t");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(series[count]+"\t");
				count++;
			}
			for(int l=1;l<i;l++) {
				System.out.print(series[count]+"\t");
				count++;
			}
				System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciPattern230921 fibonacci=new FibonacciPattern230921();
		int series[]=new int[fibonacci.size];
		fibonacci.getFibonacci(series);
		fibonacci.toPrint(series);
	}

}
