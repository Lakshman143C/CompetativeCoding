package org.laxman.striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class NoOfSubSeqSatisfyGivenCond1498 {
     private int count = 0;
    static private int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
    static private final int MOD=1_000_000_007;
    public static void main(String[] args) {
        int[] nums={14,4,6,6,20,8,5,6,8,12,6,10,14,9,17,16,9,7,14,11,14,15,13,11,10,18,13,17,17,14,17,7,9,5,10,13,8,5,18,20,7,5,5,15,19,14};
        List<Integer> list=new ArrayList<>();
        NoOfSubSeqSatisfyGivenCond1498 problem=new NoOfSubSeqSatisfyGivenCond1498();
        problem.count(nums,0,22,list);
        System.out.println(problem.count);
    }

     public void count(int[] nums,int i,int target,List<Integer> list){
        if(i>=nums.length){
            if(check(list,target))
                count=(count+1)%MOD;
            return;
        }
        list.add(nums[i]);
        count(nums,i+1,target,list);
        list.remove(list.size()-1);
        count(nums,i+1,target,list);
    }

     public boolean check(List<Integer> list, int target){
       int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
       for(int i=0;i<list.size();i++){
           min=Math.min(min,list.get(i));
           max=Math.max(max,list.get(i));
       }
       return  max!=Integer.MIN_VALUE &&
               min!=Integer.MAX_VALUE &&
               (min+max)<=target;
   }

}
