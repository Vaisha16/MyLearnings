package com.myLearning.basics;

import java.util.Scanner;

//07-Sep-2021
public class EbBillCalculator {
	public static void main(String arg[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Old Reading : ");
		int oldReading=scanner.nextInt();
		System.out.print("Enter the New Reading : ");
		int newReading=scanner.nextInt();
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