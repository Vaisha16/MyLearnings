package com.myLearning.basics;

public class AutomaticTellerMachine {
	public static void main(String arg[]) {
		int amount=880;
		int a,n;
		/*a=amount/500;
		amount-=(a*500);
		b=amount/200;
		amount-=(b*200);
		c=amount/100;
		amount-=(c*100);
		System.out.println("RS 500:" +a+" Rs 200:"+b+ " Rs 100: "+c);
		*/
		if((amount%100)>0) {
			System.out.println("Amount should be multiples of 100");
		}
		else {
		System.out.println("Rs \t Denomination");
		for(int i=amount;i>0;){
			n=500;
			if((amount/n)>0) {
				a=amount/n;
				System.out.println(n+ " \t "+a);
				amount-=(a*n);
			}
			n=200;
			if((amount/n)>0) {
				a=amount/n;
				System.out.println(n+ " \t "+a);
				amount-=(a*n);
			}
			n=100;
			if((amount/n)>0) {
				a=amount/n;
				System.out.println(n+ " \t "+a);
				amount-=(a*n);
			}
		}
		}
	}
}
