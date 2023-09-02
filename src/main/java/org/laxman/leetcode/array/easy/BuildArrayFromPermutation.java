package org.laxman.leetcode.array.easy;
public class BuildArrayFromPermutation {
    public static void main(String[] args){
        int nums[]={0,2,1,5,3,4};
        int arr[]=buildArray(nums);
        for(int i:arr)
            System.out.print(i+" ");
    }
    public static int[] buildArray(int[] nums) {
        int[] permutaionsArray=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            permutaionsArray[i]=nums[nums[i]];
        }
        return permutaionsArray;
    }
}
