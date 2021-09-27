package com.myLearning.arrayBasic;

public class SubArraySum {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,6,9};
		int size=a.length,sum=0;
		int first=0,last=0,s=5;
		for(int i=0;i<size;i++) {
			first=i;
			sum+=a[i];
			while(sum>=s) {
				sum-=a[first];
				first++;
			}last=i;
			System.out.println("Position from: "+first+" to "+last);
		}
	}
}
