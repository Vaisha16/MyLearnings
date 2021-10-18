package com.myLearning.Inheritance;

public class ChildClass extends SingleInheritance{
	ChildClass(int a){
		super(a);
		add();
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c=new ChildClass(5);
	}

}
