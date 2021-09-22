package com.myLearning.arrayBasic;

import java.util.Scanner;

public class PatternSeries01 {
	static int r,n=0,temp=0,powerValue;
	void noOfSeries() {
		for(int i=0;i<r;i++) {
			powerValue=(int) Math.pow(2,i);
			n=n+powerValue;
			//System.out.println(n);
		}
	}
	void pat() {
		int count=0;
		int s=0;
		int series[]=new int[n];
		for(int a=0;a<n;a++) {
			series[a]=temp;
			temp=series[a]+s+3;
			s=s+2;
			//System.out.println(series[a]);
		}
		if(count<n) {
		for(int i=1;i<=r;i++) {
			for(int j=r;j>i;j--) {//for loop to print space
				System.out.print("*\t");
			}
			for(int j=0;j<r;j++) {
				if(series[count]==0) {
					break;}
					System.out.print(j+"\t");
					
			}count++;
			System.out.println();
		}
	}
	}
	
	public static void main(String args[]) {
		PatternSeries01 o=new PatternSeries01();
		Scanner scan=new Scanner(System.in);
		r=scan.nextInt();
		o.noOfSeries();
		o.pat();
	}
}