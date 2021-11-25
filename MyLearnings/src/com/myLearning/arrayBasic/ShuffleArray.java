package com.myLearning.arrayBasic;

import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {

	public static void main(String[] args) {
		Random random=new Random();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=scanner.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<size;i++)
			a[i]=scanner.nextInt();
		int ranIndex,temp;
		for(int i=0;i<size;i++) {
			ranIndex=random.nextInt(size);
			temp=a[ranIndex];
			a[ranIndex]=a[i];
			a[i]=temp;
		}
		System.out.print("The Elements are: ");
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+"\t");
		}
		scanner.close();
	}
}
