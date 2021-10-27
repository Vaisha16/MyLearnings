package com.myLearning.arrayBasic;

public class UnionIntersection {
	int a[]= {1,2,3};
	int b[]= {1,2,3,4,5};
	int c[]=new int[(a.length+b.length)];
	int len=a.length;
	boolean duplicate;
	int lastIndex=0;
	
	void printUnion() {
		int c[]=new int[(a.length+b.length)];
		int lastIndex=0;
		for(int i=0;i<a.length;i++)
			c[i]=a[i];
		
		for(int i=0;i<b.length;i++) {
			duplicate=false;
			for(int j=0;j<a.length;j++) {
				if(b[i]==c[j]) {
					duplicate=true;
					break;
				}
			}if(!duplicate) {
				c[len]=b[i];
				len++;
				lastIndex=len;
			}
		}
		System.out.print("Union: ");
		for(int i=0;i<lastIndex;i++) {
			System.out.print(c[i]+"\t");
		}
	}
	
	void printIntersection() {
		len=0;
		for(int i=0;i<b.length;i++) {
			duplicate=false;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					duplicate=true;
					break;
				}
			}if(duplicate) {
				c[len]=b[i];
				len++;
				lastIndex=len;
			}
		}
		System.out.print("Intersection: ");
		for(int i=0;i<lastIndex;i++) {
			System.out.print(c[i]+"\t");
		}
	}
	
	public static void main(String args[]) {
		UnionIntersection u=new UnionIntersection();
		u.printUnion();
		u.printIntersection();
	}
}
