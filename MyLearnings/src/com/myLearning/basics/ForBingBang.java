package com.myLearning.basics;

class ForBingBang{
public static void main(String arg[]){
for(int i=1;i<=16;i++)
{
if(i%3 ==0 && i%5==0)
System.out.println("BINGBANG");
else if(i%3 ==0)
System.out.println("Bing");
else if(i%5==0)
System.out.println("Bang");
else
System.out.println(i);
}
}
}