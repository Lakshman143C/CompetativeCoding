package org.laxman.striver.binarySearch;

import java.util.Arrays;

public class KokoEatingBananas875 {
    public static void main(String[] args) {
        int[]  a={312884470};
        minEatingSpeed(a,312884469);
    }
    static public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l=piles[0],r=piles[piles.length-1],m=0,res;
        while(l<=r){
            m=l+(r-l)/2;
            if(calc(piles,m)<=h){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return m;
    }

    static public int calc(int[] piles,int m){
        int timeTaken=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]<=m)
                timeTaken+=1;
            else {
                timeTaken+=Math.ceil((double)piles[i]/m);
            }
        }
        return timeTaken;
    }

}
