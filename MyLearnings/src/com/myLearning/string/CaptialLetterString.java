package com.myLearning.string;

import java.util.Scanner;

public class CaptialLetterString {
	Scanner scanner=new Scanner(System.in);
	String str=scanner.nextLine();
	String word[]=str.split("\\s");
	String s="";
	char whiteSpace=' ';
	int length=str.length();
	
	CaptialLetterString(){
		for(int i=0;i<word.length;i++) {
			String firstLetter=word[i].substring(0,1);
			String remaning=word[i].substring(1);
			s+=firstLetter.toUpperCase()+remaning+" ";
		}
	}
	public static void main(String args[]) {
		CaptialLetterString reverse=new CaptialLetterString();
		System.out.println(reverse.s);
	}
}
