
package com.myLearning.Overloading;

public class methodOverloading {
	void getPrint(){
		System.out.println("Empty");
	}
	void getPrint(int a) {
		System.out.println("Inerger: "+a);
	}
	void getPrint(String str) {
		System.out.println("String: "+str);
	}
	public static void main(String args[]) {
		methodOverloading m=new methodOverloading();
		m.getPrint();
		m.getPrint(5);
		m.getPrint("JAVA");
	}

}
