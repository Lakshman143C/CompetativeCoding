package org.laxman.striver.strings.bsonanswersminmax;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] nums={1, 2, 4, 8, 9};
        aggressiveCows(nums,3);
    }
    public static int aggressiveCows(int[] stalls, int k) {
        int l=0,r=1000000,m=0,res=0;
        Arrays.sort(stalls);
        while(l<=r){
            m=(l+r)>>1;
            if(compute(stalls,m,k)){
                res=Math.max(res,m);
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return res;
    }

    public static boolean compute(int[] stalls,int distance,int cows){
        cows--;
        int prevCowInd=0;
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-stalls[prevCowInd]>=distance) {
                prevCowInd = i;
                cows--;
            }
            if(cows<=0)
                return true;
        }
        return cows<=0;
    }
}
