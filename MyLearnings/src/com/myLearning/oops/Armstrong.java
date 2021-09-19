package com.myLearning.oops;

public class Armstrong {
	int pow,number=153,len=0,temp=number,num=0,sum=0;
	void isArmstrong() {
		leng();
		temp=number;
		split();
		if(num==number) {
			System.out.println(number+ ", "+sum+" is an Armstrong number");
		}
		else {
			System.out.println(number+ ", "+sum+ " is not an Armstrong number");
		}
	}
	
	void leng() {
		for(;temp>0;temp=temp/10) {
			num=temp%10;
			len++;
		}
	}
	
	void split() {
		for(;temp>0;temp=temp/10) {
			num=temp%10;
			power();
			System.out.println(pow);
			sum=sum+pow;
		}
	}	
	int power() {
		pow=1;
		for(int j=1;j<=len;j++)
			pow=pow*num;
		return pow;
	}
	
	public static void main(String arg[]) {
		Armstrong a=new Armstrong();
		a.isArmstrong();
	}
}
