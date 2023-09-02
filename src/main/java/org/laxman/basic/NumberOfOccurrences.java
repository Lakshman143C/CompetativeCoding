package org.laxman.basic;

import java.util.Scanner;

public class NumberOfOccurrences {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the digit and the number to count the occurrences:");
        int num=in.nextInt();
        int OccurenceNumber=in.nextInt();
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==OccurenceNumber)
                count++;
            num=num/10;
        }
        System.out.println("count of "+OccurenceNumber+" is :"+count);
    }
}
