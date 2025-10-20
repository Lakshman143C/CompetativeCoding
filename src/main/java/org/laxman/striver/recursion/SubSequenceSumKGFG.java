package org.laxman.striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceSumKGFG {

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        checkSubsequenceSum(7,nums,8);
    }
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
    List<Integer> list=new ArrayList<>();
        return check(list,0,arr,K,0);
    }
    public static boolean check(List<Integer> list,int i,int[] nums,int k,int sum){
        if(i>=nums.length || sum>k){
            System.out.println(list);
            if(sum==k) return true;
            else return false;
        }
        sum+=nums[i];
        list.add(nums[i]);
        boolean isExists=check(list,i+1,nums,k,sum);
        if(!isExists){
            Integer poppedEle = list.remove(list.size() - 1);
            sum-=poppedEle;
            sum+=nums[i+1];
            check(list,i+1,nums,k,sum);
        }
        return isExists;
    }
}
