package com.myLearning.NumberSeries;

import java.util.Scanner;

public class NumSeries03 {
	public static void main(String[] args) {
		int num=11,size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		sc.close();
		if(size==1)
			System.out.println(num+"\t");
		else {
			for(int i=1;i<=size;i++) {
				System.out.println(num+"\t");
				if(i%2==1)
					num+=2;
				else
					num+=4;
			}
		}	
	}
}
