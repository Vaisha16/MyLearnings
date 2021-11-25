package com.myLearning.testPrograms;

import java.util.Scanner;
//specialChar 33 to 47 and 58 to 64 and 91 to 96 and 123 to 127
//Number 48 to 57
//A-Z 65-90
//a-z 97 to 122

public class PasswordChecker {
	String str;
	char letter;
	boolean upperCase,lowerCase,number,specialChar,length;
	
	void checkPassword() {
		if(str.length()>=8) {
			length=true;
		}
		for(int i=0;i<str.length();i++) {
			letter=str.charAt(i);
			if((letter>=33 && letter<=47)||(letter>=58 && letter<=64)||(letter>=91 && letter<=96)||(letter>=123 && letter<=127)) {
				specialChar=true;
				break;
			}
		}
		for(int i=0;i<str.length();i++) {
			letter=str.charAt(i);
			if(letter>=48 && letter<=57) {
				number=true;
				break;
			}
		}
		for(int i=0;i<str.length();i++) {
			letter=str.charAt(i);
			if(letter>=65 && letter<=90) {
				upperCase=true;
				break;
			}
		}
		for(int i=0;i<str.length();i++) {
			letter=str.charAt(i);
			if(letter>=97 && letter<=122) {
				lowerCase=true;
				break;
			}
		}
		if(length && specialChar && number && upperCase && lowerCase)
			System.out.println("Valid Password");
		else
			System.out.println("Not a valid Password");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		PasswordChecker p=new PasswordChecker();
		System.out.println("Please Enter the Password: ");
		p.str=scanner.next();
		p.checkPassword();
		scanner.close();
		}

}
