package com.myLearning.oops;

public class SumOfDigits {
	static int num=713589,sum=0;
	static void sumOf() {
		while(num>0){
			sum+=(num%10);	
			num=num/10;
			if(num==0 && sum>10) {
				num=sum;
				sum=0;
			}
		}
	}
	public static void main(String args[]) {
			sumOf();
			System.out.println(sum);
		}
}
