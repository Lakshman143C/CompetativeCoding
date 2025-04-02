package org.laxman.striver.array.hard;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-10, -5, -5, -4, -4, -3, -2, -2, 0, 0, 1, 2, 2, 2, 2, 5, 5};
        threeSum(nums);
    }

    // two pointer approach

    static public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int j=i+1,k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> r=new ArrayList<>();
                    r.add(nums[i]);
                    r.add(nums[j]);
                    r.add(nums[k]);
                    res.add(r);
                    j=moveToNextDiffEle(nums,j,nums[j]);
                    k=moveToPreDiffEle(nums,k,nums[k]);
                }
                else if(sum<0){
                    j=moveToNextDiffEle(nums,j,nums[j]);
                }
                else if(sum>0){
                    k=moveToPreDiffEle(nums,k,nums[k]);
                }
            }
            i=moveToNextDiffEle(nums,i,nums[i]);
        }
        return res;
    }
    static public int moveToNextDiffEle(int[] arr,int k,int ele){
        while(k<arr.length && arr[k]==ele)
            k++;
        return k;
    }

    static public int moveToPreDiffEle(int[] arr,int k,int ele){
        while(k>-1 && arr[k]==ele)
            k--;
        return k;
    }

    //two pointer approach same way



    // o(n^2+log(m)) logic
    static public List<List<Integer>> threeSum2(int[] nums) {

        HashSet<List<Integer>> set2=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int k=-(nums[i]+nums[j]);
                if(set.contains(k)){
                    List<Integer> r=new ArrayList<>();
                    r.add(nums[i]);
                    r.add(nums[j]);
                    r.add(k);
                    Collections.sort(r);
                    set2.add(r);
                }
                else{
                    set.add(nums[j]);
                }
            }
        }
        List<List<Integer>> res=new ArrayList<>(set2);
        return res;
    }
}
