package com.myLearning.basics;

import java.util.Scanner;

public class Pattern11 {
	public static void main(String arg[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Pattern Size: ");
		int size=scan.nextInt();
		int a,b=size;
		for(int i=0;i<size;i++){   
			a=i;
			if(i==0) {
				for(int j=0;j<size;j++){	
					System.out.print(++a+"\t");
				}
			}
			else if(i==size-1) {
				a=size;
				for(int j=size;j>0;j--){	
					System.out.print(a--+"\t");
				}
			}
			
			else {
				a=i;
				for(int k=i;k<i+1;k++) {
					System.out.print(++a+"\t");
				}
				for(int l=2;l<size;l++) {
					System.out.print("\t");
				}
				for(int m=size;m<size+1;m++) {
					System.out.print(--b+"\t");
				}
				
			}
			System.out.println("");
		}scan.close();
	} 
}