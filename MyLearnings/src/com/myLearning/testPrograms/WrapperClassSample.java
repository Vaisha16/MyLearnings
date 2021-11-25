package com.myLearning.testPrograms;

public class WrapperClassSample {
	public static void main(String args[]) {
		Object a[]= {5,6.7,true,"java"};
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
		a[0]=7.8;
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		
	}

}
