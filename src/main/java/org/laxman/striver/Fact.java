package org.laxman.striver;

import java.util.ArrayList;

public class Fact {
    public static void main(String[] args) {
        int[] a={1,4,3,2,6,5,7};
        revRecursion(0,a.length-1,a);
        System.out.println(a);
    }

    static void revRecursion(int l,int r,int a[]){
        if(l>r)
            return;
        int t=a[l];
        a[l]=a[r];
        a[r]=t;
        revRecursion(++l,--r,a);
    }

    static void revArr(int a[]){
        int l=0,r=a.length-1;
        while(l<r){
            int t=a[l];
            a[l]=a[r];
            a[r]=t;
            l++;r--;
        }
        System.out.println(a);
    }

    private static void factorials() {
        int n = 5;
        ArrayList<Long> factorials = new ArrayList<>();
        long fact = 0;
        for (long i = 1; i <= n; i++) {
            fact = factorial(i);
            if (fact > n)
                break;
            factorials.add(fact);
        }
        System.out.println(factorials);
    }

    static long factorial(long n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
}
