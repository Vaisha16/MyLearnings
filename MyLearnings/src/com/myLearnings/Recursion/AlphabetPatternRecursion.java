package com.myLearnings.Recursion;

import java.util.Scanner;

public class AlphabetPatternRecursion {
	int size,count=0,temp=0;
	char alpha='a';
	char a=alpha;
	
	void getPat1() {
		for(int i=1;i<=size;i++) {
			alpha=(char)(a+temp);
			for(int count=0;count<size;count++) {
				for(int j=1;j<=(size*2);j++) {
					if(j==size*2){
						System.out.print("");
					}
					else if(i==j || (i+j)==(size*2)) {
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
				}System.out.println();
				temp++;
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
