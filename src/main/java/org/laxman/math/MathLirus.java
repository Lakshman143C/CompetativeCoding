package org.laxman.math;

public class MathLirus {
    public static void main(String[] args) {
        int temp=gcd(25,45);
        System.out.println(temp);
    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return Math.abs(a);
    }
}
