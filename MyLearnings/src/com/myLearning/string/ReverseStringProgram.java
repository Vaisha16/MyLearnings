package com.myLearning.string;

import java.util.Scanner;

public class ReverseStringProgram {
	Scanner scanner=new Scanner(System.in);
	String str=scanner.next();
	String s="";
	int length=str.length();
	ReverseStringProgram(){
		for(int i=(length-1);i>=0;i--)
			s+=str.charAt(i);
	}
	public static void main(String args[]) {
		ReverseStringProgram reverse=new ReverseStringProgram();
		System.out.println(reverse.s);
	}
}
