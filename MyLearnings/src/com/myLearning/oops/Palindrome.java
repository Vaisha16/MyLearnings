package com.myLearning.oops;

public class Palindrome {
 int n=454,reverse=0,m=n;
 void isPalindrome() {
	 for(;n>0;n=n/10) {
			reverse=reverse*10+(n%10);
		}
	 if(m==reverse)
		 System.out.println(m+" is a Palindrome Number");
	 else
		 System.out.println(m+" is not a Palindrome Number");
		 
 }
 public static void main(String args[]) {
	 Palindrome p=new Palindrome();
	 p.isPalindrome();
 }
}
