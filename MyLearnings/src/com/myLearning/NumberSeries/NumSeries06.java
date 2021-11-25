package com.myLearning.NumberSeries;
// 13,25,51,101,203

import java.util.Scanner;

public class NumSeries06 {

	public static void main(String[] args) {
		int num=13,size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		sc.close();
		for(int i=1;i<=size;i++) {
			System.out.print(num+"\t");
			if(i%2==1)
				num+=num-1;
			else
				num+=num+1;
		}
	}
}
