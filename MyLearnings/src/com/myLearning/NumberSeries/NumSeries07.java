package com.myLearning.NumberSeries;
// 121,144,169,196…

import java.util.Scanner;

public class NumSeries07 {

	public static void main(String[] args) {
		int num=121,temp=23,size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		sc.close();
		for(int i=1;i<=size;i++) {
			System.out.print(num+"\t");
			num+=temp;
			temp+=2;
		}
	}
}

