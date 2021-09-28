package com.myLearnings.Recursion;

import java.util.Scanner;

public class AlphabetPatternRecursion {
	int size,count=0;
	char alpha='a';
	char a=alpha;
	void getPat1() {
		for(int i=1;i<=size;i++) {
			alpha=(char)(a+i-1);
			for(int count=0;count<size;count++) {
			for(int j=1;j<=size;j++) {
				if(i==j) {
					System.out.print(alpha+"");
					alpha++;
				}
				else if(j<i){
					System.out.print(" ");
				}
				else {
					System.out.print(" ");
					alpha++;
				}
			}
			for(int k=size+1;k<=((size*2));k++) {
				if(i==k) {
					System.out.print(" ");
					}
				else if((i+k)==(size*2)) {
					System.out.print(alpha+"");
					}
				else {
					System.out.print(" ");
					}
				alpha++;
				}
			}System.out.println();
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
