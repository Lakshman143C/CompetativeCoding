package org.laxman.leetcode.array.easy;
public class ConcatenationofArray {
    public static void main(String[] args){
        int[] nums={1,2,1};
        int arr[]=getConcatenation(nums);
        for(int i:arr)
            System.out.print(i+" ");
    }
    public static int[] getConcatenation(int[] nums) {
        int[] newarr=new int[nums.length*2];
        System.arraycopy(nums,0,newarr,0,nums.length);
        System.arraycopy(nums,0,newarr,nums.length,nums.length);
        return newarr;
    }
}
