package org.laxman.striver.slidingwindow.variableLenWindow;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr={-5, 8, -14, 2, 4, 12};
        int k=-5;
        int res=longestSubarray(arr,k);
    }
    /// this is for less than or equal to k not for equal to k
    public static int longestSubarray(int[] arr, int k) {
        int l=0,r=0,sum=0,maxLen=0;
        while(r<arr.length){
            sum+=arr[r];
            while(l< r && sum>k){
                sum-=arr[l++];
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
