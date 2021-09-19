package com.myLearning.basics;
public class Pattern12 {
	public static void main(String arg[]){
		for(int i=4;i>=0;i--)
		{ 
			for(int j=0;j<=4;j++)
			{	
				if((i==0 || i==4) && j==2)
				{
					System.out.print("*");
				}
				else if((i==1 && j==1)||(i==1 && j==3) || (i==3 && j==1) || (i==3 && j==3))
					{
					System.out.print("*");
					}
				else if((i==2) && (j==0 ||j==4))
					{
					System.out.print("*");
					}
				else
					System.out.print(" ");
			}
			System.out.println();

		}
	} 
}