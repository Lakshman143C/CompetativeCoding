package org.laxman.striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsRecursive20 {
    public static void main(String[] args) {
        List<List<Integer>> res=new ArrayList<>();

        List<Integer> list=new ArrayList<>();
        int[] nums={3,1,2};
        generate(res,list,0,nums);
        for(List<Integer>  l:res)
            System.out.println(l);
    }
    public static void generate(List<List<Integer>> res,List<Integer> list,int i,int[] arr){
        if(i>=arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        generate(res,list,i+1,arr);
        list.remove(list.size()-1);
        generate(res,list,i+1,arr);
    }
}
