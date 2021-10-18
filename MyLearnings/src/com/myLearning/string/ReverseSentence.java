package com.myLearning.string;

import java.util.Scanner;

public class ReverseSentence {
	Scanner scanner=new Scanner(System.in);
	String str=scanner.nextLine();
	String s="";
	int length=str.length();
	ReverseSentence(){
		for(int i=(length-1);i>=0;i--)
			s+=str.charAt(i);
	}
	public static void main(String args[]) {
		ReverseSentence reverse=new ReverseSentence();
		System.out.println(reverse.s);
	}
}
