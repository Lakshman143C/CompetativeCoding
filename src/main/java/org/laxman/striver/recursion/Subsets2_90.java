package org.laxman.striver.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2_90 {
    public static void main(String[] args) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int[] nums={1,2,2};
        generateUniqueSubSets(nums,0,res,list);
        res.forEach(System.out::println);
    }
    static public void generateUniqueSubSets(int[] nums, int i, List<List<Integer>> res, List<Integer> list){
        res.add(new ArrayList<>(list));
        if(i==nums.length) return;
        for(int j=i;j<nums.length;j++){
            if(j!=i && nums[j]==nums[j-1]) continue;
            list.add(nums[j]);
            generateUniqueSubSets(nums,j+1,res,list);
            list.remove(list.size()-1);
        }
    }
}
