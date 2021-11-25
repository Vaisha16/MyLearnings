package com.myLearning.NumberSeries;
// 165,195,255,285,345…

import java.util.Scanner;

public class NumSeries08 {
	public static void main(String[] args) {
		int num=165,size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		sc.close();
		for(int i=1;i<=size;i++) {
			System.out.print(num+"\t");
			if(i%2==1)
				num+=30;
			else
				num+=60;
			}
		}
	}
