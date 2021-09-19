package com.myLearning.basics;

public class BingBang {
public static void main(String arg[]) {
	int n=45;
	if(n%3==0 && n%5==0)
		System.out.println("BingBang");
	else if(n%3==0)
		System.out.println("Bing");
	else if(n%5==0)
		System.out.println("Bang");
	else
		System.out.println(n);
}
}
