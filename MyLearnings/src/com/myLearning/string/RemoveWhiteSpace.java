package com.myLearning.string;
import java.util.Scanner;

public class RemoveWhiteSpace {
	String strSpace;
	Scanner scanner=new Scanner(System.in);
	String str=scanner.nextLine();
	
	RemoveWhiteSpace(){
		strSpace=str.replaceAll("\s","");
	}
	
	public static void main(String args[]) {
		RemoveWhiteSpace space=new RemoveWhiteSpace();
		System.out.println(space.strSpace);
		
	}

}
