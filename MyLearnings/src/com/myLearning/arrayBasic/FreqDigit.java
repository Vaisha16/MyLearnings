package com.myLearning.arrayBasic;


public class FreqDigit {
	int n,temp,sum=0;
	static int ar[]=new int[10];
	void getFrequent() {
		for(int i=0;i<10;i++)
			ar[i]=0;
		for(int i=1;i<=10000;i++) {
			for(int j=i;j>0;j=j/10) {
				n=j%10;
				ar[n]++;
				}
			}
		}
	void getLowFreq() {
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	public static void main(String args[]) {
		FreqDigit freq=new FreqDigit();
		freq.getFrequent();
		freq.getLowFreq();
		System.out.println(ar[0]);	
		}

}