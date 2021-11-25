package com.myLearning.arrayBasic;

// To print the pattern of given n number of series
import java.util.Scanner;

public class PatternSeriesN {
	static int r,n=0,temp=0;
	int sum=0;
	int center=0;
	
	void noOfSeries() {
		for(int i=1;i<=r;i++) {
			n+=(i-1)*2;
		}
	}
	void pat() {
		int count=0;
		int s=0;
		int series[]=new int[n+1];
		int left;
		int right;
		for(int a=0;a<=n;a++) {
			series[a]=temp;
			temp=series[a]+s+3;
			s=s+2;
			//System.out.print(series[a]+"\t");
		}
		System.out.println("\n");
		for(int a=0;a<n;a++) {
			series[a]=series[a+1];
		}
		System.out.println("\n");
		if(count<=n) {
		for(int i=0;i<r;i++) {
			for(int j=i+1;j<r;j++) {//for loop to print space
				System.out.print(" \t");
			}
			for(int k=0;k<i;k++) {
				if(i==0)
					break;
				System.out.print(series[count]+"\t");
				sum=sum+series[count];
				count++;
			}
			left=sum;
			sum=0;
			
			for(int l=i;l==i;l++) {			//To print the center elements
				temp=count;
				
				for(int x=0;x<i;x++) {
					sum=sum+series[temp];
					temp++;
				}
				right=sum;
				sum=0;
				center=right-left;
				System.out.print(center+"\t");
			}
			for(int k=0;k<i;k++) {
				if(i==0)
					break;
				System.out.print(series[count]+"\t");	
				count++;
			}
			System.out.println();
		}
	}
	}
	
	public static void main(String args[]) {
		PatternSeriesN o=new PatternSeriesN();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the array size");
		r=scanner.nextInt();
		o.noOfSeries();
		o.pat();
		scanner.close();
	}
}