package com.myLearning.basics;
//06-SEP-2021
public class ForReverse {
	public static void main( String arg[]) {
		int a=2576,reverse=0;
		for(;a>0;a=a/10) {
			reverse=reverse*10+(a%10);
		}
		System.out.println(reverse);
	}
}		