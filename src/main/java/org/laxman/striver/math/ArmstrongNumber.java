package org.laxman.striver.math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(1634));
    }
    public static boolean isArmstrongNumber(int n){
        int temp=n,sum=0,rem=0,pow=String.valueOf(n).length();
        while(temp!=0){
            rem=temp%10;
            sum= (int) (sum+Math.pow(rem,pow));
            temp=temp/10;
        }
        return sum==n;
    }
}
