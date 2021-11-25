package com.myLearning.arrayBasic;
//Program to push negative elements towards one side of array
import java.util.Scanner;

public class IntegerArray {
	int temp,first;
	//sorting the elements
	void getShift(int size,int[] a) {
		int count=1;
		while(count<=size) {
		for(int i=0;i<size;i++) {
			if(a[i]<0) {
				first=a[i];
				for(int j=i;j<size-1;j++) {
					a[j]=a[j+1];
				}
				a[size-1]=first;
				count++;
			}
		}
	}
}
	
	public static void main(String args[]) {
		IntegerArray p=new IntegerArray();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Elements of Array: ");
		for(int i=0;i<size;i++) 
			a[i]=s.nextInt();
		p.getShift(size,a);
		System.out.println("The sorted array elements are: ");
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
		s.close();
	}
}
