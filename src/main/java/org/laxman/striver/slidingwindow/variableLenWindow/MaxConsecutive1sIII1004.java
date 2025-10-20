package org.laxman.striver.slidingwindow.variableLenWindow;

import java.util.LinkedList;
import java.util.Queue;

public class MaxConsecutive1sIII1004 {
    public static void main(String[] args) {
        int[] a={0,0,1,1,1,0,0};
        int k=0;
        longestOnes(a,k);
    }
    static  public int longestOnes(int[] nums, int k) {
        int l=0,r=0,maxLen=0,temp=k;
        Queue<Integer> q=new LinkedList<>();
        while(r<nums.length){
            if(temp>0 && nums[r]==0){
                temp--;
                q.add(r);
            }
            else if(!q.isEmpty() && temp<=0 && nums[r]==0){
                l=q.poll()+1;
                q.add(r);
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
