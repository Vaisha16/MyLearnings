package com.myLearning.basics;

class ReverseNum{
public static void main(String arg[]){
int a=51,q,r,res=0;
if(a<100 && a>9){
q=a/10;
r=a%10;
q=q*10;
res=res+q+r;
}
System.out.println(res);
}
}