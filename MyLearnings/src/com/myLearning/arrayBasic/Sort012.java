package com.myLearning.arrayBasic;
// Need to check when input is given in single line
// if the integer is 0's 1's or 2's 
//then it asks for another integer
// when its stored in array it moves the remaining elements forward.
import java.util.Scanner;

public class Sort012 {
	int temp,number;
	void getSort(int size,int[] a) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}System.out.println("The sorted array elements are: ");
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String args[]) {
		Sort012 p=new Sort012();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Elements of Array: ");
		for(int i=0;i<size;i++) {
			p.number=s.nextInt();
			if(p.number==0 || p.number==1 || p.number==2) {
				a[i]=p.number;
			}
			else {
				System.out.println("Please enter only 0's, 1's and 2's");
				i--;
			}
		}
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
		p.getSort(size,a);
	}
}
