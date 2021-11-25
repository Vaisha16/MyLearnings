package com.myLearning.arrayBasic;

import java.util.Scanner;

public class MaxMinElement {
	int temp,min,max;
	void getSort(int size,int[] a) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	void getMaxMin(int size,int[] a){	
		//to find min and max
		max=a[size-1];
		min=a[0];
		System.out.println("The MAXIMUM Element of the array is: "+max);
		System.out.println("The MINIMUM Element of the array is: "+min);
	}
	

	public static void main(String args[]) {
		MaxMinElement p=new MaxMinElement();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Elements of Array: ");
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
		p.getSort(size,a);
		p.getMaxMin(size,a);
		s.close();
	}
}
