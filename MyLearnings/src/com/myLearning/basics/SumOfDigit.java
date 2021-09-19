package com.myLearning.basics;

class SumOfDigit{
public static void main(String arg[]){
int a=516,q,r,res=0;
if(a<10000 && a>999){
q=a/1000;
r=a%1000;
res=q;
a=r;
}
if(a<1000 && a>99){
q=a/100;
r=a%100;
res=q;
a=r;
}
if(a<100 && a>9){
q=a/10;
r=a%10;
res=res+q+r;
}
System.out.println(res);
}
}