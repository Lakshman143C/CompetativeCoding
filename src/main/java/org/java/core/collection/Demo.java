package org.java.core.collection;

public class Demo {
    public static void main(String[] args) {
        int a=5,b=10;
        System.out.println(gcd(48,18));
    }
    public static int lcm(int a,int b){
        int big=a>b?a:b;
        for(int i=2;i<10;i++){
            if(i%a==0 && i%b==0)
                return i;
        }
        return 0;
    }
    public static int gcd(int a,int b){
        if(b<a){
            a=a+b;
            b=a-b;
            a=a-b;
        }
        int t=0;
        while(a!=0){
            t=b%a;
            b=a;
            a=t;
        }
        return b;
    }

}
