package org.laxman.assignments.flowchartsudocode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumLoopInput {
    public static void main(String[] args){
        System.out.println(loopSup());
    }
    static int loopSup(){
        Scanner in=new Scanner(System.in);
        int sum=0;
        System.out.println("enter elements to sum :");
        while(true){
            try{
            sum+=in.nextInt();
            }catch (InputMismatchException e){
                break;
            }
        }
        return sum;
    }
}
