package org.laxman.assignments.flowchartsudocode;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter number to print multiplication table :");
        int n=in.nextInt();
        for(int i = 1; i <= 20; i++) {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
