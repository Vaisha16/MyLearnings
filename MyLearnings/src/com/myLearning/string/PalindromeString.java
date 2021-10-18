package com.myLearning.string;

import java.util.Scanner;

public class PalindromeString {
	Scanner scanner=new Scanner(System.in);
	String str=scanner.next();
	String s="";
	int length=str.length();
	
	PalindromeString(){
		for(int i=(length-1);i>=0;i--)
			s+=str.charAt(i);
	}
	
	void toCheck() {
		if(str.equals(s))
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is a not Palindrome");
	}
	
	public static void main(String args[]) {
		PalindromeString palindrome=new PalindromeString();
		palindrome.toCheck();		
	}
}
