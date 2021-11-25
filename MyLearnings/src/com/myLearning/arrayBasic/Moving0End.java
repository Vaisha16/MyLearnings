package com.myLearning.arrayBasic;
// Need to check when input is given in single line
// if the integer is 0's 1's or 2's 
//then it asks for another integer
// when its stored in array it moves the remaining elements forward.
import java.util.Scanner;

public class Moving0End {
	int   count;
	
	void getCount(int size,int[] a) {
		for(int i=0;i<size;i++)
			if(a[i]==0)
				count++;
	}
	void getSort(int size,int[] a) {
		int countZero=0;
		for(int i=0;i<size;i++) {
			if(a[i]==0 && countZero!=count) {
				countZero++;
				for(int j=i;j<size-1;j++) {
					a[j]=a[j+1];	
				}
				a[size-1]=0;
				i--;
				}
			}
		System.out.println("The sorted array elements are: ");
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
	}
	
	public static void main(String args[]) {
		Moving0End p=new Moving0End();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size=scanner.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Elements of Array: ");
		for(int i=0;i<size;i++) 
			a[i]=scanner.nextInt();;
		scanner.close();
		
		for(int i=0;i<size;i++)
			System.out.print(a[i]+" ");
		p.getCount(size,a);
		p.getSort(size,a);
	}
}
