package com.myLearning.oops;

public class ObjectCreation {
	public static void main(String arg[]) {
		ObjectCreation obj=new ObjectCreation();
		add();
		obj.sub();
	}
	static void add() {
		int a=5,b=2;
		System.out.println(a+b);
	}
	void sub(){
		int a=7,b=2;
		System.out.println(a-b);
	}
}
