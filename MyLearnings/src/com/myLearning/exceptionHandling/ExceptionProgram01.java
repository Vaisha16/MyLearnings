package com.myLearning.exceptionHandling;

public class ExceptionProgram01 {
	int div(int a, int b) throws Exception {
		try {
			//System.out.println("a:"+a+" b:"+b);
			return a/b;
		}
		catch(Exception e){
			//System.out.println("Exception Occurs");
			throw e;
		}
	}
	
	public static void main(String args[]) {
		ExceptionProgram01 p=new ExceptionProgram01();
		int x=-1,y=-1,z=-1;
		try {
			x=p.div(8, 2);
			}
		catch(Exception e) {
			System.out.println("Catch I");
		}
		try {
			y=p.div(8, 0);
		}
		catch(Exception e) {
			System.out.println("Catch II");
		}
		try {
			z=p.div(0, 8);
		}
		catch(Exception e) {
			System.out.println("Catch III");
		}
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
		System.out.println("Z:"+z);
	}

}
