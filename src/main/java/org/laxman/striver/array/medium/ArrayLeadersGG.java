package org.laxman.striver.array.medium;

import java.util.ArrayList;

public class ArrayLeadersGG {
    public static void main(String[] args) {
        int[][] n={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i=0;i<n.length*n[0].length;i++)
            System.out.print(n[i/n.length][i%n.length]);
    }
    //53 32 9 55 64 59 65 90
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<=arr.length-2;i++){
            if(arr[i]>=arr[i+1])
                list.add(arr[i]);
        }
        list.add(arr[arr.length-1]);
        return list;
    }
}
