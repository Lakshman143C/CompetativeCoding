package org.laxman.leetcode.array.easy;
public class RunningSumOfArray {
    public static void main(String[] args){
        int nums[]={1,2,0,4,5};
        runningSum(nums);
    }
    public static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++)
            nums[i]=nums[i-1]+nums[i];
        return nums;
    }
}
