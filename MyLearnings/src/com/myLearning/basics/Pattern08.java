package com.myLearning.basics;

public class Pattern08 {
	public static void main(String arg[]){
		//int n=5;
		for(int i=1;i<=3;i++)
		{	
			for(int j=0;j<3;j++)
			{	
				if((i==1 && j==1)||(i==3 && j==1))
					System.out.print("*");
				else if(i==2)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
		System.out.println("");
		}
	}
}