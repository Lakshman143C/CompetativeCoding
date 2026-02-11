package org.laxman.striver.dp.intro;

public class Fibnacci {
    public static void main(String[] args) {
        int f=6;
        int[] dp=new int[f+1];
        for(int i=0;i<=f;i++) dp[i]=-1;
        System.out.println(fib(f,dp));
    }
    public static int fib(int n,int[] dp){
        if(n<=1){
            dp[n]=n;
            return n;
        }
        if(dp[n]!=-1) return dp[n];
        dp[n]=fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
    }
}
