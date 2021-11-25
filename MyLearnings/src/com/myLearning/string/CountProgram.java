package com.myLearning.string;

import java.util.Scanner;

public class CountProgram {
	Scanner scanner=new Scanner(System.in);
	int countLine,countWord,countChar;
	String str=scanner.nextLine();
	String[] line=str.split("\n");
	String[] word=str.split(" ");
	
	void toCountLine() {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='.') {
				countLine++;
			}
		}
		System.out.println("the number of lines: "+(countLine+line.length));
	}
	
	void toCountWord() {
		word=str.split(" ");
		countWord=word.length;
		System.out.println("the number of words: "+countWord);
	}
	
	void toCountLetter() {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='.' && str.charAt(i)!=' ') {
				countChar++;
			}
		}System.out.println("the number of Characters: "+countChar);
	}
		
	public static void main(String args[]) {
		CountProgram c=new CountProgram();
		c.toCountLine();
		c.toCountWord();
		c.toCountLetter();
	}
}
