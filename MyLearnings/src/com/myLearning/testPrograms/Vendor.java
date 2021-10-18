package com.myLearning.testPrograms;

import java.util.Scanner;

public class Vendor {
	String name="";
	int option;
	int leadTime,choice;
	double tenderValue,projectDuration,vendorRating;
	
	int select(int a,Vendor[] vendor,int number) {
		double min;
		switch(a) {
		case 1:
			min=vendor[0].leadTime;
			for(int i=0;i<number;i++) {
				if(vendor[i].leadTime<min) {
					min=vendor[i].leadTime;
					choice=i;
				}
			}
			break;
		case 2:
			min=vendor[0].tenderValue;
			for(int i=0;i<number;i++) {
				if(vendor[i].tenderValue<min) {
					min=vendor[i].tenderValue;
					choice=i;
				}
			}
			break;
		case 3:
			min=vendor[0].projectDuration;
			for(int i=0;i<number;i++) {
				if(vendor[i].projectDuration<min) {
					min=vendor[i].projectDuration;
					choice=i;
				}
			}
			break;
		case 4:
			double max=vendor[0].vendorRating;
			for(int i=0;i<number;i++) {
				if(vendor[i].vendorRating>max) {
					max=vendor[i].vendorRating;
					choice=i;
				}
			}
			break;	
		}
		return choice;
	}
	
	public static void main(String args[]) {
		Vendor v=new Vendor();
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		Vendor[] vendor=new Vendor[number];
		for(int i=0;i<number;i++) {
			vendor[i]=new Vendor();
		}
		for(int i=0;i<number;i++) {
			vendor[i].name=s.next();
			vendor[i].leadTime=s.nextInt();
			vendor[i].tenderValue=s.nextDouble();
			vendor[i].projectDuration=s.nextDouble();
			vendor[i].vendorRating=s.nextDouble();
		}
		
		System.out.println("Select the tender attribute to choose the company \n1.Lead time\n2.Tender value\n3.Project duration\n4.Vendor rating");
		v.option=s.nextInt();
		v.choice=v.select(v.option,vendor,number);
		if(v.option==4)
			System.out.println("Mr.Mahajan, you should award the tender to "+vendor[v.choice].name+" (Note: "+vendor[v.choice].name+" has maximum Vendor Rating("+vendor[v.choice].vendorRating+") compare to others)");
		else
			System.out.print("Mr.Mahajan, you should award the tender to "+vendor[v.choice].name+" (Note: "+vendor[v.choice].name+" has minimum ");
			if(v.option==1)
				System.out.print("Lead Time("+vendor[v.choice].leadTime+") compare to others)");
			if(v.option==2)
				System.out.print("Tender Value("+vendor[v.choice].tenderValue+") compare to others)");
			if(v.option==3)
				System.out.print("Project Duration("+vendor[v.choice].projectDuration+") compare to others)");
	}
}
