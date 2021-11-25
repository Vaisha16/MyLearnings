
package com.myLearning.testPrograms;
//program to calculate discount using db connection NOT COMPLETED
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ElectronicShop2 {
	String a[]=new String[5];
	int price;
	double total,discount;
	
	ElectronicShop2(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Name:");
		a[0]=scanner.nextLine();
		System.out.println("Enter the Mobile Number:");
		a[1]=scanner.nextLine();
		while(a[1].length()!=10) {
			System.out.println("Enter the Valid Mobile Number:");
			a[1]=scanner.nextLine();
		}
		scanner.close();
	}
	int getDetails() {
		int i=1;
		System.out.println("Please select a model from the list:");
		System.out.println("Sl_No\tBrand\t \tModel\t\t\t\tPrice");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521/orcl4","SYS AS SYSDBA","Password4");  
			con.close();
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);  //to select specific row
			ResultSet rs=stmt.executeQuery("select * from laptop");  
			while(rs.next())  {
				System.out.println(i+"\t"+rs.getString("brand")+"\t\t"+rs.getString("model")+"\t\t\t"+rs.getInt("price")); 
				i++;
				}
			Scanner scanner=new Scanner(System.in);
			int value=scanner.nextInt();
			String qry="select price from laptop";
			ResultSet rs1=stmt.executeQuery(qry);
			rs1.absolute(value);
				price=rs1.getInt("price");
			con.close();  	
			scanner.close();
			}
			catch(Exception e){ System.out.println(e);}  
		return price;
		}
		double getDiscount(int price) {
			if(price>0 && price<=25000)
				discount=0.05;
			else if(price>25000 && price<=50000)
				discount=0.075;
			else if(price>50000 && price<=100000)
				discount=.10;
			else if(price>100000)
				discount=.15;
			total+=price-(price*discount);
			return total;
		}
		void toContinue() {
			int in;
			Scanner scan=new Scanner(System.in);
			do{
				System.out.println("Do u want to continue Shopping: \n1.continue\n 2.exit");
				in=scan.nextInt();
				if(in==1)
					price+=getDetails();
				else
					break;
			}while(in==1);
			scan.close();
		}
	
	public static void main(String args[]) {
		ElectronicShop2 es=new ElectronicShop2();
		es.toContinue();
		es.total=es.getDiscount(es.price);
		System.out.println("Name: "+es.a[0]+"\nMobile Number: "+es.a[1]);
		System.out.println("Final card value: Rs"+es.total);
	} 
}
