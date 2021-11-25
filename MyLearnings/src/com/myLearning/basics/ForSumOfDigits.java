package com.myLearning.basics;
//06-SEP-2021
public class ForSumOfDigits {
	public static void main( String arg[]) {
		int a=2271,sum=0;
		for(;a>0;a=a/10) {
			sum=sum+(a%10);
		}
		System.out.println(sum);
	}
}	