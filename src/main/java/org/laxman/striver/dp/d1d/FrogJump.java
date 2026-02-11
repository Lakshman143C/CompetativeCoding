package org.laxman.striver.dp.d1d;

import java.util.Arrays;

public class FrogJump {
    public static int frogJump(int n, int heights[]) {
        int[] dp=new int[heights.length+1];
        Arrays.fill(dp,-1);
        return energyRequired(0,heights,dp);
    }

    public static void main(String[] args){
        int[] heights={30,10,60,10,60,50};
        int[] dp=new int[heights.length+1];
        Arrays.fill(dp,-1);
        System.out.println(energyRequired(5,heights,dp));
    }

    public static int energyRequired(int ind,int[] arr,int[] dp){
        if(ind==0) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int left=energyRequired(ind-1,arr,dp)+Math.abs(arr[ind]-arr[ind-1]);
        int right=ind>1?energyRequired(ind-2,arr,dp)+Math.abs(arr[ind]-arr[ind-2]):Integer.MAX_VALUE;
        dp[ind]=Math.min(left,right);
        return dp[ind];
    }

    //most optimized space optimization
    public static int tabulationToOptimized(int[] arr){
        int i1=0,i2=0;
        for(int i=1;i<arr.length;i++){
            int l=i1+Math.abs(arr[i]-arr[i-1]);
            int r=i>1?i2+Math.abs(arr[i]-arr[i-2]):Integer.MAX_VALUE;
            i2=i1;
            i1=Math.min(l,r);
        }
        return i1;
    }

    //medium optimized
    public static int tabulation(int[] arr,int[] dp){
        dp[0]=0;
        for(int i=1;i<arr.length;i++){
            int l=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            int r=i>1?dp[i-2]+Math.abs(arr[i]-arr[i-2]):Integer.MAX_VALUE;

            dp[i]=Math.min(l,r);
        }
        return dp[arr.length-1];
    }
}
