package org.laxman.striver.array.medium;

import java.util.Arrays;

public class NextPermutation31 {
    public  void main(String[] args) {
        int[] nums={2,1,5,4,3,0,0};
        int[] nums2={1,2,3,4,5};
        nextPermutation(nums2);
    }
     public void nextPermutation(int[] nums) {
        int ind=getBreakingPoint(nums);
        if(ind==-1){
             Arrays.sort(nums);
            return;
        }
        for(int i=nums.length-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        reverse(nums,ind+1);
    }
     public void reverse(int[] nums, int ind){
        int l=ind,r=nums.length-1;
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }
     public void swap(int[] nums,int a,int b){
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }

     public int getBreakingPoint(int[] arr){
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1])
                return i;
        }
        return -1;
    }
}
