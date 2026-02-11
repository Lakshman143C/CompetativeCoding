package org.laxman.striver.dp.d1d;

public class FrogJumpKDistance {
    public static void main(String[] args) {
        int[] ar={10,20,30,10};
        int k=4;
        int[] dp=new int[ar.length];
        int i=ar.length-1;
        System.out.println(fun(ar,i,dp,k));
    }
    public static int fun(int[] ar,int i,int[] dp, int k){
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];
        int min=Integer.MAX_VALUE;
        for(int j=0;i<=k;j++){
            if(i-j>=0){
                int e=fun(ar,i-j,dp,k)+Math.abs(ar[i]-ar[i-j]);
                min=Math.min(e,min);
            }
        }
        dp[i]=min;
        return min;
    }
}
