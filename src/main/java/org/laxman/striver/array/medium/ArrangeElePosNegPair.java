package org.laxman.striver.array.medium;

import java.util.Arrays;

public class ArrangeElePosNegPair {
    public static void main(String[] args) {
        int[] n={28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        System.out.println(Arrays.toString(rearrangeArray(n)));
    }
    static public int[] rearrangeArray(int[] nums) {
        int[] positive=new int[nums.length/2];
        int[] negative=new int[nums.length/2];
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive[j++]=nums[i];
            }
            else
                negative[k++]=nums[i];
        }
        System.out.print(Arrays.toString(positive));
        System.out.print(Arrays.toString(negative));
        int i=0;
        k=0;j=0;
        while(k<positive.length) {
            nums[i++] = positive[k++];
            nums[i++] = negative[j++];
        }
        return nums;
    }
}
