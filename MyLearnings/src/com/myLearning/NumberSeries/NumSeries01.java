package com.myLearning.NumberSeries;

import java.util.Scanner;

public class NumSeries01 {

	public static void main(String[] args) {
		int num1=1,num2=3,num3=4,num=0,size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		sc.close();
		if(size==1)
			System.out.println(num1+"\t");
		if(size==2)
			System.out.println(num1+"\t"+num2);
		if(size==3)
			System.out.println(num1+"\t"+num2+"\t"+num3);
		else {
			System.out.print(num1+"\t"+num2+"\t"+num3+"\t");
			for(int i=1;i<=size-3;i++) {
				num=num1+num2+num3;
				num1=num2;
				num2=num3;
				num3=num;
				System.out.print(num+"\t");
			}
		}	
	}
}
