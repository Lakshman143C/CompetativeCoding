package org.laxman.basic;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter number :");
        int num=in.nextInt();
        int temp=num,sum=0;

        while(num>0){
            int rem=num%10;
            sum+=rem*rem*rem;
            num=num/10;
        }
        System.out.println("num :"+temp+" sum :"+sum);
    }
}
