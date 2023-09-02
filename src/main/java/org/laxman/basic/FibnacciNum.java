package org.laxman.basic;
import java.util.Scanner;
public class FibnacciNum {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter range to pring fibnacci series :");
        int n=in.nextInt();
        int a=0,b=1,c=0;
        for(int i=0;i<n;i++){
            System.out.print(c+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
