package com.myLearning.arrayBasic;

import java.util.Scanner;

public class UnionIntersection {
	int temp=0;
	void getPeak(int size1,int[] a,int[] b,int size2){	
		for(int i=0;i<size1;i++) {
			if(a[i]>temp) {
				temp=a[i];
				}
			}System.out.println(temp);
		}
	

	public static void main(String args[]) {
		UnionIntersection p=new UnionIntersection();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of First Array: ");
		int size1=s.nextInt();
		int a[]=new int[size1];
		System.out.println("Enter the Elements of First Array: ");
		for(int i=0;i<size1;i++)
			a[i]=s.nextInt();
		System.out.println("Enter the Size of Second Array: ");
		int size2=s.nextInt();
		int b[]=new int[size2];
		System.out.println("Enter the Elements of Second Array: ");
		for(int i=0;i<size2;i++)
			b[i]=s.nextInt();
		p.getPeak(size1,a,b,size2);
	}
}
