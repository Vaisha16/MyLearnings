package com.myLearning.basics;

import java.util.Scanner;

public class Pattern12 {
	public static void main(String arg[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the pattern size:");
		int size=scan.nextInt();
		int half=size/2;
		//Upper triangle
		for(int i=0;i<half;i++){ 
			for(int j=half;j>i;j--){	
					System.out.print(" ");
					}
			System.out.print("*");
			for(int l=0;l<i;l++){	
				System.out.print(" ");
				}
			for(int m=1;m<i;m++)
				System.out.print(" ");
			if(i>0)
				System.out.print("*");
			System.out.println();
		}
		//Lower triangle
		for(int i=0;i<=half;i++){ 
			for(int j=0;j<i;j++){
				System.out.print(" ");
				}
			System.out.print("*");
			for(int k=i;k<half;k++){	
				System.out.print(" ");
				}
			for(int l=half-1;l>i;l--){	
				System.out.print(" ");
				}
			if(i<half)
				System.out.print("*");
			System.out.println();
			}scan.close();
		}
	}
