package com.myLearning.Overloading;
// constructor should not be recursive 
//as there will be no end for the recursion. 
//But it allows to create object in constructor.

public class constructorOverloading {
	int count=0;
	constructorOverloading(){
		if(count<0) {
			System.out.println(count);
			new constructorOverloading();
			count++;
			}
		}
	constructorOverloading(int a) {
		System.out.println("Inerger: "+a);
	}
	constructorOverloading(String str) {
		System.out.println("String: "+str);
	}
	public static void main(String args[]) {
		new constructorOverloading();
		new constructorOverloading(5);
		new constructorOverloading("JAVA");
	}
}