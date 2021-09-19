package com.myLearning.basics;

class Big4{
public static void main(String arg[]){
int a=991,b=6,c=21,d=198;
if(a>b && a>c && a>d)
	System.out.println("A is Big");
else if(b>c && b>d)
	System.out.println("B is Big");
else if(c>d)
	System.out.println("C is Big");
else
	System.out.println("D is Big");
}
}