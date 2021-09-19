package com.myLearning.oops;

public class CarClass14Sep {
	int wheels=1;
	static int engine=1;
	void getRun()
	{
		System.out.println("Running");
	}
	static void getSpeed() {
		System.out.println("Speed");
	}
	public static void main(String arg[]) {
		CarClass14Sep c1=new CarClass14Sep();
		CarClass14Sep c2=new CarClass14Sep();
		c1.wheels=2;
		c1.engine=5;
		c2.wheels=8;
		c2.engine=3;
		c1.getRun();
		getSpeed();
		//System.out.println("Wheels : " + wheels);
		System.out.println("Wheels : " +c1.wheels);
		System.out.println("Wheels : " +c2.wheels);
		System.out.println("Engine : " +engine);
		System.out.println("Engine : " +c1.engine);
		System.out.println("Engine : " +c2.engine);
	}
}
