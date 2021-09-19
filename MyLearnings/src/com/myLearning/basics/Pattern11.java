package com.myLearning.basics;
public class Pattern11 {
	public static void main(String arg[]){
		for(int i=0;i<4;i++)
		{   int a=i;
			for(int j=0;j<4;j++)
			{	
				if(i==3 && j==3)
					System.out.println(1);
				else if(i==0||j==0||j==3)
					{
					a++;
					System.out.print(a+"\t");
					}
				else if(i==3)
					{a--;
					System.out.print(a+"\t");
					}
				else
					System.out.print("\t");
			}
			System.out.println("");
			//System.out.println("");
			//System.out.println("");
		}
	} 
}