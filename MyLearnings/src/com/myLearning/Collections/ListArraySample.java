package com.myLearning.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dynamic binding parentClass reference=new ChildReference
		ArrayList l=new ArrayList();
		ArrayList l2=new ArrayList();
		ArrayList l3=new ArrayList();
		l.add(100);
		l.add(1);
		l.add(4);
		l.add(589);
		l.add("vaishu");
		System.out.println(l);
		l2.addAll(l);
		System.out.println(l2);
		l3.add("hello");
		l3.add("bye");
		System.out.println(l3);
		l3.addAll(1,l2);
		System.out.println(l3);
		l3.add(2, "hi");
		System.out.println(l3);
		//l2.clear();
	//	System.out.println(l2);
		System.out.println(l.containsAll(l3));
		System.out.println(l2.equals(l));
	}

}
