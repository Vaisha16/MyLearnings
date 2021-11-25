package com.myLearning.string;

import java.util.Scanner;

public class DuplicateInteger {
	static Scanner scanner=new Scanner(System.in);
	static int n;
	boolean duplicate=false,repeat=false;
	
	void toCheckDuplicate(int[] a) {
		System.out.println("Duplicates: ");		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]==a[j] && i!=j) {
					duplicate=true;
					if(i>j)
						duplicate=false;
					break;
					}
				}
			if(duplicate)
				System.out.print(a[i]+"\t");
			duplicate=false;
			}
		}
	
	public static void main(String args[]) {
		DuplicateInteger duplicateInteger=new DuplicateInteger();
		n=scanner.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scanner.nextInt();
		duplicateInteger.toCheckDuplicate(a);
	}
}
