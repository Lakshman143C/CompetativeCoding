package org.laxman.basic;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args){
        int arr[][]={
                {39,84,32},
                {2,7,8,3,4,9},
                {38,22,34,}
        };
        int ans[]=search(arr,22);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int arr[][],int ele){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==ele)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
