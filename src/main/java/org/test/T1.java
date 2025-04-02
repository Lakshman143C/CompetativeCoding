package org.test;

import java.util.ArrayList;
import java.util.List;

public class T1 {
    public static void main(String[] args) {
        int[][] nums = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[][] nums2 = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12}
        };

        List<Integer> spiralOrder = spiralOrder(nums2);
        System.out.println(spiralOrder);
    }
    static public List<Integer> spiralOrder(int[][] nums) {
        int t=0,l=0,r=nums[0].length-1,b=nums.length-1;
        List<Integer> res=new ArrayList<>();
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++)         // left to righ
                res.add(nums[t][i]);
            t++;

            for(int i=t;i<=b;i++)          //top to bottom
                res.add(nums[i][r]);
            r--;

            for(int i=r;i>=l;i--)         //right to left
                res.add(nums[b][i]);
            b--;

            for(int i=b;i>=t;i--)         //bottom to top
                res.add(nums[i][l]);
            l++;
        }
        return res;
    }
}
