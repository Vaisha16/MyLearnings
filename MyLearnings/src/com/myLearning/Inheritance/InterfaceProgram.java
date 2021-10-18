package com.myLearning.Inheritance;

public class InterfaceProgram implements A,B{
	
	public void m1() {
		System.out.println("m1 a value: "+A.a);
		System.out.println("m1 a value: "+B.a);
	}
	public int m2() {
		System.out.println("m2");
		return 0;
	}
	public void m3(int a) {
		int b=a;
		System.out.println("m3 b value:"+b);
	}
	public void m4() {
		System.out.println("m4");
	}
	public static void main(String args[]) {
		InterfaceProgram s=new InterfaceProgram();
		s.m1();
		s.m2();
		s.m3(150);
		s.m4();
	}
}
