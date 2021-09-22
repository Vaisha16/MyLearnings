package com.myLearning.arrayBasic;

import java.util.Scanner;

public class NegativeInteger {
	int temp;
	//sorting the elements
	void getSort(int size,int[] a) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {	
				if(a[i]<0) {		//swapping the elements
					temp=a[i];
					for(int m=0;m<size;m++) {
						for(int n=m+1;n<size;n++) {
					}
				}
			}
		}System.out.println("The sorted array elements are: ");
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
	}

	public static void main(String args[]) {
		NegativeInteger p=new NegativeInteger();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Elements of Array: ");
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
		p.getSort(size,a);
	}
}
