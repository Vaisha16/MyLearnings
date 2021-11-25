package com.myLearning.arrayBasic;

import java.util.Scanner;

public class KthSmallBig {
	int temp,small,big;
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
	void getMaxMin(int[] a,int k,int size){	
		//to find the Kth largest and smallest number
		big=a[size-k];
		small=a[k-1];
		System.out.println("The "+k+" th smallest element is: "+small);
		System.out.println("The "+k+" th biggest element is: "+big);
	}
	
	public static void main(String args[]) {
		KthSmallBig p=new KthSmallBig();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.print("Enter the Elements of Array: ");
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
		System.out.println("Enter the K value: ");
		int k=s.nextInt();
		p.getSort(size,a);
		p.getMaxMin(a,k,size);
		s.close();
	}
}
