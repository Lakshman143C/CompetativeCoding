package org.laxman.striver.recursion.subsequence;

public class practice {
    public static final int MOD=1_000_000_007;
    public static int count=0;
    public static void main(String[] args) {
        int[] nums={14,4,6,6,20,8,5,6,8,12,6,10,14,9,17,16,9,7,14,11,14,15,13,11,10,18,13,17,17,14,17,7,9,5,10,13,8,5,18,20,7,5,5,15,19,14};
        count(nums,0,22,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        System.out.println(count);
    }

    public static void count(int[] nums,int i,int target,int len,int min,int max){
        if(i>=nums.length){
            if(len>0 && (min+max)<=target){
                count=(count+1)%MOD;
            }
            return;
        }
        int newMin=Math.min(min,nums[i]);
        int newMax=Math.max(max,nums[i]);
        count(nums,i+1,target,len+1,newMin,newMax);
        count(nums,i+1,target,len,min,max);
    }
}
