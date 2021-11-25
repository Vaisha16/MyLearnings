package com.miniProject.Banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class OracleConnection {
		public static void main(String args[]) {
			try {
				MongoClient mongoClient = new MongoClient("localhost", 27017);  
				
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl4","SYS AS SYSDBA","Password4");  
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
				}
				catch(Exception e){ System.out.println(e);}  
			return price;
			}
		}
}
