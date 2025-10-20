package org.laxman.striver.binarySearch;

public class SmallestDivisor1283 {
    public static void main(String[] args) {
        int[] nums={1,2,5,9};
        smallestDivisor(nums,6);
    }

    static public int smallestDivisor(int[] nums, int threshold) {
        int l=0,r=100,m=0,res=0;
        while(l<=r){
            m=(l+r)>>1;
            if(getSum(nums,m)>=threshold){
                res=m;
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return res;
    }

    static int getSum(int[] nums,int divisor){
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=Math.ceil((double)nums[i]/divisor);

        return sum;
    }
}
