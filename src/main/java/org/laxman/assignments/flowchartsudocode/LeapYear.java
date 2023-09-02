package org.laxman.assignments.flowchartsudocode;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter year :");
        int year=in.nextInt();
        System.out.println(isLeapYear(year));
    }
    static String isLeapYear(int year){
        return year%4==0 && year%100!=0?"Yes":"no";
    }
}
