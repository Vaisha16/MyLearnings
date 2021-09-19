package com.myLearning.basics;

class Descending{
	
	public static void main(String arg[]){
			int a=2,b=5,c=1;
			int d = 0;
			if(a<b) {
				d=a;
				a=b;
				b=d;
			}
			if(a<c) {
				d=a;
				a=c;
				c=d;
			}
			if(b<c) {
				d=b;
				b=c;
				c=d;
			}
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
	}
}