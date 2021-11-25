package com.myLearning.NumberSeries;
// 3,7,16,35…

import java.util.Scanner;

public class NumSeries10 {

	public static void main(String[] args) {
		int num=3,num1=num+1,size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		sc.close();
		for(int i=1;i<=size;i++) {
			System.out.print(num+"\t");
			num+=num1;
			num1+=num1+1;
		}
	}
}
