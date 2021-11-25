package com.myLearning.arrayBasic;
//program to sort odd and even numbers with in an array.

import java.util.Scanner;

public class OddEvenArray {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the size of array:");
       int len=sc.nextInt();
       int a[]=new int[len];
       System.out.print("Enter the array elements:");
       for(int i=0;i<len;i++)
    	   a[i]=sc.nextInt();
        int lastIndex=0;
        int b[]=new int[len];
        for(int i=0;i<a.length;i++){
            if(a[i]%2==1){
                b[lastIndex++]=a[i];
            }
        }
        for(int i=0;i<len;i++){
            if(a[i]%2==0){
                b[lastIndex++]=a[i];
            }
        }
        for(int i=0;i<len;i++){
            System.out.print(b[i]+"\t");
        }
        sc.close();
    }
}
