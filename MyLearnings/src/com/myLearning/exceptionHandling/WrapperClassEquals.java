package com.myLearning.exceptionHandling;

public class WrapperClassEquals {
	public static void main(String args[]) {
	Integer a=new Integer(5);
	Integer b=new Integer(5);
	//System.out.println("First:"+a==b);
	
	Integer aa=5;
	Integer bb=5;
	System.out.println("Second:"+aa.equals(bb));
	}
}
