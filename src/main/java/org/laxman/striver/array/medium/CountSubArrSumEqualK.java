package org.laxman.striver.array.medium;

public class CountSubArrSumEqualK {
    public static void main(String[] args) {
        int[] nums={4,1,2,3,2,5,4,1,5};
        subarraySum(nums,5);
    }
    static public int subarraySum(int[] nums, int k) {
        int count=0,l=0,r=0,sum=nums[0];
        while(r<nums.length-1){
            sum+=nums[++r];
            if(sum<0)
                sum=0;
            else if(sum==k){
                count++;
                sum-=nums[l++];
            }
            else{
                while(sum>k){
                    sum-=nums[l++];
                }
                if(sum==k){
                    count++;
                    sum-=nums[l++];
                }
            }
        }
        return count;
    }
}
