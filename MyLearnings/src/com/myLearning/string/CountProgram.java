package com.myLearning.string;

import java.util.Scanner;

public class CountProgram {
	
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		String s="";
		int length=str.length();
		for(int i=(length-1);i>=0;i--) {
			s+=str.charAt(i);
		}
		System.out.println(s);
	}
}
