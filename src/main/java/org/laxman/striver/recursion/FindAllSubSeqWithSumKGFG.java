package org.laxman.striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubSeqWithSumKGFG {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        findSubSequenceWithSumK(res,list,0,0,2,arr);
        System.out.println(res);

    }
    public static void findSubSequenceWithSumK(List<List<Integer>> res,List<Integer> list,
                                               int sum,int ind,int k,int[] arr){
        if(ind==arr.length){
            if(sum==k){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(arr[ind]);
        sum+=arr[ind];
        findSubSequenceWithSumK(res,list,sum,ind+1,k,arr);
        Integer poppedEle = list.remove(list.size() - 1);
        sum-=poppedEle;
        findSubSequenceWithSumK(res,list,sum,ind+1,k,arr);
    }
}
