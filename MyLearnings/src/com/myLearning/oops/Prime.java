package com.myLearning.oops;

public class Prime {
	int n=2,m=n/2;
	void isPrime() {
		if(n==0||n==1) {
			System.out.println(n+" is a neither a prime number nor a composite number");
		}
		else if(n==2||n==3) {
			System.out.println(n+" is a prime number");
		}
		else {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(n+" is not a prime number");
				break;
			}
			else {
				System.out.println(n+" is a prime number");
				break;
			}
			
		}
	}
}
	public static void main(String args[]) {
		Prime p=new Prime();
		p.isPrime();
	}
}
