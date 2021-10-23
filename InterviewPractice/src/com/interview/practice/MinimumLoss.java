package com.interview.practice;
/* Alice wants to buy a house and sell it after some years. She has loss by doing so.
 * Find the minimum loss using the price given for the house for some years. eg: price[4]={12,5,3,6}.
 * Alice has minimum loss of Rs 1 after buying the house in the year 2 for Rs.5 and selling it in the year 3 for Rs.3. 
 */
import java.util.Scanner;

public class MinimumLoss {
	static Scanner sc=new Scanner(System.in);
	
	int minLoss(int n,int price[]) {
		int minimum=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(price[i]>price[j]) {
					minimum=price[i]-price[j];
					break;
				}
			}
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(price[i]>price[j]) {
					if(minimum>price[i]-price[j]) {
						minimum=price[i]-price[j];
					}
				}
			}
		}
		return minimum;
	}
	
	public static void main(String args[]) {
		MinimumLoss min=new MinimumLoss();
		int n;
		do {
			System.out.println("Enter number of year(between 2 to 2000): ");
			n=sc.nextInt();
		}while(n<2 || n>2000);
		
		int price[]=new int[n];
		for(int i=0;i<n;i++) {
			do{
				System.out.print("Enter the Price(Between 1 to 10000) for year "+(i+1)+" :");
				price[i]=sc.nextInt();
				System.out.println();
			}while(price[i]<1 || price[i]>10000);
		}
		int minimum=min.minLoss(n,price);
		if(minimum==0)
			System.out.println("There is no loss: ");
		else
			System.out.println("The Minimum Loss for buying and selling the house is: "+minimum);
	}
}