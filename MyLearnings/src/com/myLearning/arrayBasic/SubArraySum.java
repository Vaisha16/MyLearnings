package com.myLearning.arrayBasic;

import java.util.Scanner;

public class SubArraySum {
	int first=0,last=0,s,sum=0;
	
	void toCheck(int a[],int size) {
		for(int i=0;i<size;i++) {
			sum+=a[i];
			if(sum>=s) {
				last=i;
				while(s<sum && first<last) {
					sum-=a[first];
					++first;
			}
			if(sum==s) {
					System.out.println("From position "+(first+1)+" to position "+(last+1));
					break;
				}
			else {
				System.out.println("no elements");
				break;
				}
			}
			
		}
	}
	
	public static void main(String args[]) {
		SubArraySum subarray=new SubArraySum();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size=scanner.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the array Elements: ");
		for(int i=0;i<size;i++)
			a[i]=scanner.nextInt();
		System.out.println("Enter the sum value: ");
		subarray.s=scanner.nextInt();
		subarray.toCheck(a, size);
		scanner.close();
	}
}
