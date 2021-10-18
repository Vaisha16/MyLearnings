package com.myLearning.Recursion;

public class PrintNum {
	int count=0;
	void toPrint() {
		if(count<10) {
			System.out.println(++count);
			toPrint();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNum num=new PrintNum();
		num.toPrint();

	}

}
