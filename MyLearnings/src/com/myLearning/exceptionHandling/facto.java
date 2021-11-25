package com.myLearning.exceptionHandling;

public class facto {
	int n=5;
	void fact(){
	 int sum=1;
	for (int j=1;j<=n;j++) {
		sum=sum*j;
	
	}	
	System.out.println(sum);
	
	}
	public static void main(String args[]) {
		facto A=new facto();
		A.fact();

}}
