package org.laxman.striver.array.easy;

import java.util.HashMap;

public class LongSubArrWithSumK {
    public static void main(String[] args) {
        int[] n={1,2,3,1,1,1,1,4,2,3};
        longSubArrWithSumKPositive(n,3);
    }

    public static int longSubArrWithSumKPositive(int[] nums,int k){
        HashMap<Long,Integer> prefixSum=new HashMap<>();
        long sum=0;int maxLen=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefixSum.put(sum,i);
            if(sum==k)
                maxLen=Math.max(maxLen,i+1);
            else if (prefixSum.containsKey((long)sum-k)) {
                maxLen=Math.max(maxLen,(i-prefixSum.get(sum-k)));
            }
        }
        return maxLen;
    }
    
}
