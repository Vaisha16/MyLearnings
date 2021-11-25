package com.myLearning.string;

//First Non repeated character

import java.util.Scanner;

public class NonRepeatChar {
	int[] c=new int[26];
	int output;
	int min=0,index;
	char out;
	
	Scanner scanner=new Scanner(System.in);
	String str=scanner.next();	
	
	void getNonRepeat() {
		for(int i=0;i<c.length;i++) {
			c[i]=0;
			}
		for(int i=0;i<str.length();i++) {
			output=(int)str.charAt(i)-97;
			c[output]++;
		}
		for(int i=0;i<c.length;i++) {
			if(c[i]==1) {
				min=c[i];
				index=i;
				break;
			}
		}
		if(min!=0) {
			out=(char) (index+97);
			System.out.println(out);
		}
		else
			System.out.println("there is no non repeating letter");
	}
	
	public static void main(String args[]) {
		NonRepeatChar c=new NonRepeatChar();
		c.getNonRepeat();
	}
}
