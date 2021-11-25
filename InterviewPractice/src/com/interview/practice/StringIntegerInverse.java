package com.interview.practice;

import java.util.Scanner;

public class StringIntegerInverse {
	static Scanner sc=new Scanner(System.in);
	char[] num= {'0','1','2','3','4','5','6','7','8','9','-'};
	boolean negative=false,comma=false;
	String output="",temp="";
	int addValue=0,len=0;
	String str[];				//splitting the string by finding space
	int length;					//store the length of str array in length variable
	String reverseValue;
	
	String toConvert(String string,int n,boolean inverse) {
		//variable initialization
		String str[]=string.split(" ");	
		length=str.length;	
		for(int i=0;i<length;i++){							//outer for loop for each str
			
			for(int j=0;j<num.length;j++) {					//inner for loop for each num
				
				if(str[i].endsWith(","))					//check if str[i] ends with ,
					comma=true;								//change value of comma as true
				if(str[i].startsWith("-"))					//check if str[i] is negative
					negative=true;							//change value of negative as true 
				
				if(str[i].charAt(0)==num[j]) {				//if condition to check whether the str[i] starts with num
					temp=str[i];							// store the str[i] in a temp variable
					if(comma) {								
						temp=temp.replace(",","");			//if str[i] ends with comma, remove it
					}
					
					if(negative) {							//check for negative integer in String
						temp=temp.replace("-","");			//remove it
						addValue=Integer.parseInt(temp)-n;	//convert the string str to int and subtract n from it
					}
					else
						addValue=Integer.parseInt(temp)+n;		//convert the string str to int and add n to it 
					len=temp.length();
					
					temp=""+addValue;
					
					if(inverse) {
						for(int k=temp.length()-1;k>=0;k--) {
							reverseValue+=temp.charAt(k);
						}
						temp=reverseValue;
					}
					
					while(len>temp.length()) {
						if(inverse)
							temp+="0";
						else
							temp="0"+temp;
					}
					str[i]=temp;
					
					if(comma)
						str[i]=str[i]+",";				//if comma is true then append , at the end
	
					if(negative)							
						str[i]="-"+str[i];				//if string integer is negative append the '-' in front 
					break;								//Once first index is checked then go out of inner for loop
				}
			}
			negative=comma=false;
			reverseValue="";
			addValue=0;
			temp="";
			
			output+=str[i]+" ";
		}
		return output;
	}

	public static void main(String[] args) {
		StringIntegerInverse sii=new StringIntegerInverse();
		System.out.print("String= ");
		String string=sc.nextLine();
		System.out.print("n= ");
		int n=sc.nextInt();
		System.out.print("inverse(true/false)= ");
		boolean inverse=sc.nextBoolean();
		System.out.println(sii.toConvert(string,n,inverse));
	}
}
