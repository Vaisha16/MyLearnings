package com.myLearnings.Recursion;

import java.util.Scanner;

public class SumOfElementRecursion {
	int i=0,sum=0,size;
	void getSum(int[] a) {
		if(i<size) {
				sum+=a[i];
				i++;
				getSum(a);
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfElementRecursion sumofelement=new SumOfElementRecursion();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the array size: ");
		sumofelement.size=scanner.nextInt();
		int a[]=new int[sumofelement.size];
		System.out.println("PLease enter the array elements: ");
		for(int i=0;i<sumofelement.size;i++)
			a[i]=scanner.nextInt();
		sumofelement.getSum(a);
		System.out.print("Sum of the Element in an array:  "+sumofelement.sum);
	}

}
