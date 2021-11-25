package com.myLearning.oops;
//Plain Old Java Object
//

public class PojoJavaBeans {
	int rollNo;
	String name;
	PojoJavaBeans(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	
	PojoJavaBeans(PojoJavaBeans pojo){
		this.rollNo=pojo.rollNo;
		this.name=pojo.name;
	}
	public static void main(String args[]) {
		PojoJavaBeans pojo=new PojoJavaBeans(1,"vaishaa");
		PojoJavaBeans pojo1=new PojoJavaBeans(pojo.rollNo,pojo.name);
		PojoJavaBeans pojo2=new PojoJavaBeans(pojo);
		System.out.println("RollNo:"+pojo.rollNo+" Name:"+pojo.name);
		System.out.println("RollNo:"+pojo1.rollNo+" Name:"+pojo1.name);
		System.out.println("RollNo:"+pojo2.rollNo+" Name:"+pojo2.name);
	}

}
