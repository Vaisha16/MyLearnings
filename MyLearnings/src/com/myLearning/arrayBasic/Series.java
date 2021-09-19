package com.myLearning.arrayBasic;

import java.util.Scanner;

public class Series {
	static int r,n=0,temp=0;
	void noOfSeries() {
		for(int i=1;i<=r;i++) {
			//System.out.print(temp+" ");
			//n+=temp;
			//temp=temp+2;
			n=((i*2)-1)+n;
		}
	}
	void pat() {
		int count=-1;
		int s=0;
		int series[]=new int[n];
		for(int a=0;a<n;a++) {
			series[a]=temp;
			temp=series[a]+s+3;
			s=s+2;
		}
		for(int i=r;i>=1;i--) {			
			for(int j=1;j<i;j++) {//for loop to print space
				System.out.print(" ");
			}count= i;
			for(int k=1;k<=n;k++) {
				for(int j=1;j<=(k*2-1);j++) {
					System.out.println(series[count]);
					System.out.print(count);
					count++;
					}
				}
			System.out.println();
			}
		}
	public static void main(String args[]) {
		Series o=new Series();
		Scanner scan=new Scanner(System.in);
		r=scan.nextInt();
		o.noOfSeries();
		//o.pat();
	}
}
