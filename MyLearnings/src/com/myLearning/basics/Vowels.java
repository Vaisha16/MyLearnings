package com.myLearning.basics;

public class Vowels {
	public static void main(String arg[]){
		char ch='A';
		if(ch>=65 && ch<=90)
		{
			int convert=ch+32;
			ch=(char)convert;
		}
		switch (ch)
		{
		case 'a':
			System.out.println("VOWEL");
			break;
		case 'e':
			System.out.println("VOWEL");
			break;
		case 'i':
			System.out.println("VOWEL");
			break;
		case 'o':
			System.out.println("VOWEL");
			break;
		case 'u':
			System.out.println("VOWEL");
			break;
		default: 
			System.out.println("Consonant");
		}
	}
}
