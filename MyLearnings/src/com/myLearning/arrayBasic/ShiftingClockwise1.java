package com.myLearning.arrayBasic;

import java.util.Scanner;

public class ShiftingClockwise1 {
	
	void toShift(int[] a,int size) {
		int last=a[size-1];
		for(int i=size-1;i>0;i--)
			a[i]=a[i-1];
		a[0]=last;
		}

	void toPrint(int[] a,int size) {
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
	}
	
	public static void main(String args[]) {
		int size;
		ShiftingClockwise1 shifting=new ShiftingClockwise1();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		size=scanner.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array Elements: ");
		for(int i=0;i<size;i++) 
			a[i]=scanner.nextInt();
		System.out.print("original array values : ");
		shifting.toPrint(a,size);
		shifting.toShift(a,size);
		System.out.print("Shifted array values : ");
		shifting.toPrint(a,size);
		scanner.close();
	}

}