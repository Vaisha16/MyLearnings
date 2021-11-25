package com.myLearning.string;

import java.util.Scanner;

public class CountVowelConsonent {
	Scanner scanner=new Scanner(System.in);
	int countVowel=0,countConsonent=0,countLetter=0;
	char[] num= {'a','e','i','o','u','A','E','I','O','U'};
	String str=scanner.nextLine();
	String[] word=str.split(" ");
	
	void toCountVowel() {
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<num.length;j++) {
				if(str.charAt(i)==num[j]) {
					countVowel++;
				}
			}
		}System.out.println("the number of Vowels: "+countVowel);
	}
	
	void toCountConsonent() {
		for(int i=0;i<str.length();i++) {
				if(str.charAt(i)!=' ') {
					countLetter++;
				}
			}countConsonent=countLetter-countVowel;
		System.out.println("the number of Consonents: "+countConsonent);
	}
		
	public static void main(String args[]) {
		CountVowelConsonent c=new CountVowelConsonent();
		c.toCountVowel();
		c.toCountConsonent();
	}
}
