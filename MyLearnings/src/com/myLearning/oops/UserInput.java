package com.myLearning.oops;
import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {
		int input;
		Scanner s=new Scanner(System.in);
		input=s.nextInt();
		int result=input+1;
		System.out.println(result);
	}
}
