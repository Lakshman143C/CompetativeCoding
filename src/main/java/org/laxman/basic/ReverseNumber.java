package org.laxman.basic;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number to reverse :");
        int num=in.nextInt();
        int reverse=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }
        System.out.println("reverse of "+temp+" is "+reverse);
    }
}
