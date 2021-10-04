package com.myLearning.arrayBasic;

public class ReturnArray {
	int[] get() {
		int a[]= {1,2,3,4,5};
		return a;
	}
	public static void main(String args[]) {
		ReturnArray r=new ReturnArray();
		int b[]=r.get();
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+"\t");
		}
	}

}
