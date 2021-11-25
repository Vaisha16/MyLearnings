package com.myLearning.arrayBasic;

import java.util.Scanner;

public class PeakElement {
	int temp=0;
	void getPeak(int size,int[] a){	
		for(int i=0;i<size;i++) {
			if(a[i]>temp) {
				temp=a[i];
				}
			}System.out.println(temp);
		}
	

	public static void main(String args[]) {
		PeakElement p=new PeakElement();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Elements of Array: ");
		for(int i=0;i<size;i++)
			a[i]=s.nextInt();
		p.getPeak(size,a);
		s.close();
	}
}
