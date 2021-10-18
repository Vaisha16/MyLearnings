package com.myLearning.Recursion;

import java.util.Scanner;

public class AlphabetPatternRecursion {
	int size,count=0,temp=0,n;
	String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	char alpha='a';
	char a=alpha;
	
	void getPat1() {
		n=(size*2)-3;
		for(int i=1;i<=size;i++) {
			alpha=(char)(a+temp);
				for(int j=1;j<=size;j++) {
					if(i==j) {
						System.out.print(alpha+"");
						for(int x=0;x<n;x++) {
							System.out.print("/");		
							}
						alpha+=6;
						System.out.print(alpha+"");
						}
					}
				System.out.println();
				temp++;
				}
			}
	
	public static void main(String arg[]){
		AlphabetPatternRecursion alphabet=new AlphabetPatternRecursion();
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter the pattern size: ");
		alphabet.size=scanner.nextInt();
		alphabet.getPat1();
	}
}
