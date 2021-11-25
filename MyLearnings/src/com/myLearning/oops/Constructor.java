package com.myLearning.oops;

public class Constructor {
	Constructor() {
		this(10,6);
	}
	Constructor(int a,int b){
		System.out.println(a+b);
		toSub(a,b);
		}
	static void toSub(int a,int b) {
		System.out.println(a-b+"\nStatic Method");
	}

	public static void main(String[] args) {
		new Constructor();
	}

}
