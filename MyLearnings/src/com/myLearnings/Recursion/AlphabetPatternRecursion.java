package com.myLearnings.Recursion;

import java.util.Scanner;

public class AlphabetPatternRecursion {
	int size,alpha=65,a=0;
	void getPat1() {
		if(a<(size/2)) {
			for(int i=0;i<size;i++){
				for(int m=0;m<i;m++){	
					System.out.print(" ");
					}
				for(int n=i;n==i;n++) {
					System.out.print((char)alpha);
					alpha++;
					}
				int k=size-i;
				for(;k>=i;k--){
					System.out.print(" ");
					alpha++;
					}
				System.out.print((char)alpha);
				alpha++;
				System.out.println("");
				}
			a++;
			getPat1();
			}
		}
	
	
	public static void main(String arg[]){
		AlphabetPatternRecursion alphabet=new AlphabetPatternRecursion();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the pattern size:");
		alphabet.size=scanner.nextInt();
		alphabet.getPat1();
	}
}
