package com.myLearning.basics;

class Small4{
	public static void main(String arg[]){
		int a=1,b=6,c=21,d=11;
		if(a<b && a<c && a<d)
			System.out.println("A is small");
		else if(b<c && b<d)
			System.out.println("B is small");
		else if(c<d)
			System.out.println("C is small");
		else
			System.out.println("D is small");
		}
	}