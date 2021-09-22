package com.myLearning.arrayBasic;

import java.util.Scanner;

public class ReverseArray {
	int temp,min,max;
	void getReverse(int size,int[] a) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
		}
		// printing the reverse array
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String args[]) {
		ReverseArray p=new ReverseArray();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Elements of Array: ");
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
		p.getReverse(size,a);
	}
}
