package com.myLearning.arrayBasic;
//Program to find the least frequent digit between 1 to 10000

public class FreqDigit {
	int n,temp;
	int index=0,min=ar[index];
	static int ar[]=new int[10];
	void getDigitCount() {
		for(int i=0;i<10;i++)
			ar[i]=0;
		for(int i=1;i<=10000;i++) {
			for(int j=i;j>0;j=j/10) {
				n=j%10;
				ar[n]++;
				}
			}
		}
	void getLeastFrequent() {
		for(int i=1;i<10;i++) {
			if(ar[i]<min) {
				min=ar[i];
				index=i;
			}
		}
	}
	public static void main(String args[]) {
		FreqDigit freq=new FreqDigit();
		freq.getDigitCount();
		freq.getLeastFrequent();
		System.out.println("The lease Frequent digit is: "+freq.index);
		System.out.println("The Frequency of the digit is: "+ar[freq.index]);	
		}

}