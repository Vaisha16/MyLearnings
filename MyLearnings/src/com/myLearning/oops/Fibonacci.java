package com.myLearning.oops;

public class Fibonacci {
	public static void main(String args[]) {
		int a,b,c,n=5;
		a=0;
		b=1;
		c=0;
		for(int i=1;i<=n;i++) {
			c+=a;
			a=b;
			b=c;
			//if(c%2==0) {
			System.out.print(" " +c);
			//}
		}
	}
}
