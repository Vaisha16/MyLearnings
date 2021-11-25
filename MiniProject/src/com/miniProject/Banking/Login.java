package com.miniProject.Banking;

import java.util.Scanner;

public class Login {
	Scanner scanner=new Scanner(System.in);
	String userName,password;
	Login(){
		System.out.println("Enter the username:");
		userName=scanner.next();
		System.out.println("Enter the Password:");
		password=scanner.next();
	}
	boolean toCheck() {
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl4","SYS AS SYSDBA","Password4");
		return true;
	}
	public static void main(String args[]) {
		Login login= new Login();
		boolean loginCredential=login.toCheck();
		
	}

}
