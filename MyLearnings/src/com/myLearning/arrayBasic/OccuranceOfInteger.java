package com.myLearning.arrayBasic;

import java.util.Scanner;

//Program to find the Occurance of integer

public class OccuranceOfInteger {
	int n,count=0;
	static int size;
	void getOccurance(int k,int[] ar) {
		for(int i=0;i<size;i++) 
			if(ar[i]==k)
				count++;
		System.out.println(k+" Occurs "+count+" time");
	}
	public static void main(String args[]) {
		OccuranceOfInteger occurance=new OccuranceOfInteger();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		size=s.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<size;i++)
			ar[i]=s.nextInt();
		System.out.println("Enter the Interger: ");
		int k=s.nextInt();
		occurance.getOccurance(k,ar);
	}

}