package com.myLearning.NumberSeries;
// 1,0,0,2,3,7,3,8…

import java.util.Scanner;

public class NumSeries09 {

	public static void main(String[] args) {
		int a=1,num1=0,num2=0,num3=0,size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		sc.close();
		for(int i=1;i<=size;) {
			if(i<=size) {
				num1=(a*1);
				i++;
				System.out.print(num1+"\t");
			}
			if(i<=size) {
				num2=(a*a)-1;
				i++;
				System.out.print(num2+"\t");
			}
			if(i<=size) {
				num3=(a*a*a)-1;
				i++;
				System.out.print(num3+"\t");
			}
			a++;
			System.out.println("Next Method");
			
		}
	}
}