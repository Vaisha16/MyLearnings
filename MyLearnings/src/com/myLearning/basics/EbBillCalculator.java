package com.myLearning.basics;
//07-Sep-2021
public class EbBillCalculator {
	public static void main(String arg[]) {
		int oldReading=1500,newReading=2100;
		int units=newReading-oldReading;
		System.out.print("UNITS : "+units);
		double fare=0;
		if(units<=100) {
			fare=0;
		}
		else if(units<=200) {
			fare=(units-100)*1.5+20;
		}
		else if(units<=500) {
			fare=(100*2)+(units-200)*3+30;
		}
		else if(units>500) {
			fare=(100*3.5)+(300*4.6)+(units-500)*6.6+50;
		}
		System.out.print("\t Fare : "+fare);
	}
}