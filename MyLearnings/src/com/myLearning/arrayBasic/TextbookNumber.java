package com.myLearning.arrayBasic;
//Print the number of pages in a book which has 192 digits
public class TextbookNumber {
	int i,digit=192,number=0,count=0,temp;
	void getBookNumber() {
		for(i=1;number<=192;i++) {
			for(int j=i;j>0;j/=10) {
				temp=j%10;
				number++;
			}count++;
		}System.out.println(count/2);
	}
	public static void main(String args[]) {
		TextbookNumber t=new TextbookNumber();
		t.getBookNumber();
	}
}
