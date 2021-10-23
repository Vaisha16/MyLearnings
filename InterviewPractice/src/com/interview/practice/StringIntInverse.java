package com.interview.practice;

import java.util.Scanner;

public class StringIntInverse {
	static Scanner sc=new Scanner(System.in);
	char[] num= {'0','1','2','3','4','5','6','7','8','9','-'};
	
	static void pnl() {
		System.out.println();
	}
	
	String toConvert(String string,int n,boolean inverse) {
		String output="",temp="";
		int addValue=0,r=0,revInt=0;
		String str[]=string.split(" ");						//splitting the string by finding space
		int length=str.length;								//store the length of str array in length variable
		for(int i=0;i<length;i++){							//outer for loop for each str
			for(int j=0;j<num.length;j++) {					//inner for loop for each num
				if(str[i].charAt(0)==num[j]) {				//if condition to check whether the str[i] starts with num
					if(str[i].endsWith(","))				//if condition to check whether the str[i] ends with ,
						temp=str[i].replace(",","");		//str[i] ends with comma, remove it
					else
						temp=str[i];						//otherwise store the str[i] in a temp variable
					addValue=Integer.parseInt(temp)+n;		//convert the string str to int and add n to it 
					if(inverse) {
						for(;addValue>0;addValue/=10) {
							r=addValue%10;
							revInt=revInt*10+r;
						}
						addValue=revInt;
						revInt=0;
					}
					if(str[i].endsWith(","))
						str[i]=addValue+",";				//convert int to string
					else
						str[i]=addValue+"";					//convert int to string
					break;									//Once first index is checked then go out of inner for loop
				}
			}addValue=0;
			temp="";
			output+=str[i]+" ";
		}
		return output;
	}

	public static void main(String[] args) {
		StringIntInverse sii=new StringIntInverse();
		System.out.print("String= ");
		String string=sc.nextLine();
		System.out.print("n= ");
		int n=sc.nextInt();
		System.out.print("inverse(true/false)= ");
		boolean inverse=sc.nextBoolean();
		System.out.println(sii.toConvert(string,n,inverse));
	}

}
