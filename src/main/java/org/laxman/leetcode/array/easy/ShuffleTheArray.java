package org.laxman.leetcode.array.easy;
public class ShuffleTheArray {
    public static void main(String[] args){
        int[] nums={2,5,1,3,4,7};
        int arr[]=shuffle(nums,3);
        for(int i:arr)
            System.out.print(i+" ");
    }
    static public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        for(int i=0;i<n;i++){
            arr[i*2]=nums[i];
            arr[i*2+1]=nums[n+i];
        }
        return arr;
    }
}
