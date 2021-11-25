package com.myLearning.string;

import java.util.Scanner;

public class CountStringInteger {
	Scanner scanner=new Scanner(System.in);
	int countWord=0,countInt=0;
	char[] num= {'0','1','2','3','4','5','6','7','8','9'};
	String str=scanner.nextLine();
	String[] word=str.split(" ");
	
	void toCountStringInteger() {
		for(int i=0;i<word.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(word[i].charAt(0)==num[j]) {
					countInt++;
					break;
				}
			}
		}countWord=word.length-countInt;
		System.out.println("the number of Strings: "+countWord);
		System.out.println("the number of Integers: "+countInt);
	}
		
	public static void main(String args[]) {
		CountStringInteger c=new CountStringInteger();
		c.toCountStringInteger();
	}
}
