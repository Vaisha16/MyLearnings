package com.myLearning.NumberSeries;

import java.util.Scanner;

public class NumSeries02 {

	public static void main(String[] args) {
		int num=2,temp=4,size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		sc.close();
		if(size==1)
			System.out.println(num+"\t");
		else {
			for(int i=1;i<=size;i++) {
				System.out.print(num+"\t");
				num+=temp;
				temp++;
			}
		}	
	}
}
