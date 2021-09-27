package com.myLearnings.Recursion;

import java.util.Scanner;

public class LargestElementRecursion {
	int i=0,max=0,size;
	void getLargest(int[] a) {
		if(i<size) {
			if(a[i]>max) {
				max=a[i];
			}
			i++;
			getLargest(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestElementRecursion large=new LargestElementRecursion();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the array size: ");
		large.size=scanner.nextInt();
		int a[]=new int[large.size];
		System.out.println("PLease enter the array elements: ");
		for(int i=0;i<large.size;i++)
			a[i]=scanner.nextInt();
		large.getLargest(a);
		System.out.println("Largest Element in Array is: "+large.max);
	}

}
