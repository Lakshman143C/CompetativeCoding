package org.laxman.striver.dp.d1d;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};
        int[] dp=new int[nums.length+1];
        int l=fun(nums,0,dp)+nums[0];
        Arrays.fill(dp,0);
        int r=fun(nums,1,dp)+nums[1];
        System.out.println(Math.max(l,r));
    }

    public static int fun(int[] ar,int i,int[] dp){
        if(i==ar.length-1) return ar[i];
        if(dp[i]!=0) return dp[i];
        int max=0;
        for(int j=i+2;j<ar.length;j+=2){
            int val=j<ar.length-1?fun(ar,j,dp)+ar[j]:0;
            max=Math.max(val,max);
        }
        dp[i]=max;
        return max;
    }
}
