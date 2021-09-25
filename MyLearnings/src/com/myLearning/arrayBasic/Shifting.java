package com.myLearning.arrayBasic;

import java.util.Scanner;

public class Shifting {
	void toShift(int[] a,int size,int n,int direction) {
		int j,last,first;
		switch(direction) {
		case 1:
			for(int i=0;i<n;i++) {
				last=a[size-1];
			for(j=size-1;j>0;j--)
				a[j]=a[j-1];
			a[0]=last;
		}
		break;
		case 2:
			for(int i=0;i<n;i++) {
				first=a[0];
			for(j=0;j<size-1;j++)
				a[j]=a[j+1];
			a[size-1]=first;
		}
		break;
	}
		
	}
	void toPrint(int[] a,int size) {
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
	}
	
	public static void main(String args[]) {
		int size,n;
		Shifting shifting=new Shifting();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array Elements: ");
		for(int i=0;i<size;i++) 
			a[i]=scan.nextInt();
		System.out.println("Enter the shift value: ");
		n=scan.nextInt();
		System.out.println("enter the shift direction: \n 1.Right\n2.Left");
		int direction=scan.nextInt();
		System.out.print("original array values : ");
		shifting.toPrint(a,size);
		shifting.toShift(a,size,n,direction);
		System.out.print("Shifted array values : ");
		shifting.toPrint(a,size);
		scan.close();
	}

}