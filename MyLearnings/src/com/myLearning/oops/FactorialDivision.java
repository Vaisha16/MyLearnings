package com.myLearning.oops;

/*
 * ((n-1)!/(n+1)!)+((n-2)!/(n+2)!)-(n-3)!/(n+3)!)+(n-4)!/(n+4)!)-......
 */

import java.util.Scanner;

public class FactorialDivision {
	
	int fact(int number) {
	int factResult=1;
	for(int j=1;j<=number;j++)	{
		factResult*=j;
	}
	return factResult;
}

public static void main(String[] args) {
	FactorialDivision factorial=new FactorialDivision();
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int count=0,num,den;
	double result=0,div=0;
	for(int i=n;i>0;i--) {
		count++;
		num=factorial.fact(i-1);
		den=factorial.fact(i+1);
		div=(double)num/den;
		if(count%2==1)
			result+=div;
		else
			result-=div;
	}
	System.out.println(result);	
	scanner.close();

}

}
