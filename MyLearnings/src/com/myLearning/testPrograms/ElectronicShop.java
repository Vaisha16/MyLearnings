package com.myLearning.testPrograms;

import java.util.Scanner;

//program to calculate discount

public class ElectronicShop {
	Scanner scanner=new Scanner(System.in);
	String a[]=new String[2];
	double total,discount,price;
	int index,option;
	String brand[][]={{"mi","Notebook pro","56490"},{"mi","Notebook Ultra","59990"},{"Xiomi","RedmiBook 15e-learning","41999"},{"Lenovo","Ideapad Flex 3i 11.6 inch","30990"},{"Lenovo","Ideapad Flex 3i 14 inch","25990"},{"Lenovo","Legion 5 Pro","139990"},{"Lenovo","Legion 7i","199990"},{"Dell","Inspiron 2-in-1","53000"},{"Dell","Alienware x17","290990"},{"Dell","Alienware x15","240990"},{"HP","15-BG004AU","23297"},{"HP","Chromebook 11A-NA0002MU","23490"}};
	
	
	ElectronicShop(){
		System.out.println("Enter the Name:");
		a[0]=scanner.nextLine();
		System.out.println("Enter the Mobile Number:");
		a[1]=scanner.nextLine();
		while(a[1].length()!=10) {
			System.out.println("Enter the Valid Mobile Number:");
			a[1]=scanner.nextLine();
		}
	}
	double getDetails() {
		int count=1;
		System.out.println("Please select a model from the list:");
		System.out.println("Sl_No\t\t\tBrand\t\t\tModel\t\t\tPrice");
		for(int i=0;i<brand.length;i++) {
			System.out.print(count++);
			for(int j=0;j<brand[0].length;j++) {
				System.out.print("\t\t\t"+brand[i][j]);
			}System.out.println();
		}
		System.out.println("Select the model: ");
		index=scanner.nextInt();
		price=Integer.parseInt(brand[index-1][2]);
		return price;
	}
		double getDiscount(double price) {
			if(price>0 && price<=25000)
				discount=0.05;
			else if(price>25000 && price<=50000)
				discount=0.075;
			else if(price>50000 && price<=100000)
				discount=.10;
			else if(price>100000)
				discount=.15;
			total+=price-(price*discount);
			return total;
		}
	
	public static void main(String args[]) {
		ElectronicShop es=new ElectronicShop();
		
		do{
			System.out.println("Do u want to continue Shopping: \n1.continue\n 2.exit");
			es.option=es.scanner.nextInt();
			if(es.option==1)
				es.price+=es.getDetails();
			else
				break;
		}while(es.option==1);
		
		es.total=es.getDiscount(es.price);
		System.out.println("Name: "+es.a[0]+"\nMobile Number: "+es.a[1]);
		System.out.println("Final card value: Rs"+es.total);
		
	} 
}
