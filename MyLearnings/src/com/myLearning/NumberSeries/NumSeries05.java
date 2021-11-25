package com.myLearning.NumberSeries;
// 2,3,6,18,108	

import java.util.Scanner;

public class NumSeries05 {

	public static void main(String[] args) {
		int num=0,num1=2,num2=3,size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		sc.close();
		if(size==1)
			System.out.println(num1+"\t");
		else {
			for(int i=1;i<=size;i++) {
				num=num1;
				num1=num2;
				num2=num*num1;
				System.out.print(num+"\t");
			}
		}
	}
}
