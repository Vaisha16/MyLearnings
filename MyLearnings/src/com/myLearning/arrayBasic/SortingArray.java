package com.myLearning.arrayBasic;

import java.util.Scanner;

public class SortingArray {
	int temp;
	//sorting the elements
	void getSort(int size,int[] a) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]>a[j]) {		//swapping the elements
					temp=a[i]; 		
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}System.out.println("The sorted array elements are: ");
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
	}

	public static void main(String args[]) {
		SortingArray p=new SortingArray();
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
