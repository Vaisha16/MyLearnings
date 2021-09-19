package com.myLearning.oops;

public class Basic {
	int num=1;
	void fact() {
		int result=1;
		for(int i=1;i<=num;i++) {
			result*=i;
		}
		System.out.println("Factorial of " +num+ "is "+result);
	}
	void fibonacci() {
		int a=0,b=1,c=0;
		for(int i=1;i<=num;i++) {
			c+=a;
			a=b;
			b=c;
			System.out.print(" " +c);
		}System.out.println();
	}
	public static void main(String args[]) {
		Basic b1=new Basic();
		Basic b2=new Basic();
		b1.num=3;
		b2.num=15;
		b1.fact();
		b2.fact();
		b1.fibonacci();
		b2.fibonacci();
	}
}
