package org.laxman.assignments.flowchartsudocode;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter number to check perfect or not :");
        System.out.print(isPerfectNumber(in.nextInt()));


    }
    public static boolean isPerfectNumber(int num){
        int factorsSum=0;
        for(int i=1;i<=(num/2);i++){
            if(num%i==0)
                factorsSum+=i;
        }
        return factorsSum==num;
    }
}
