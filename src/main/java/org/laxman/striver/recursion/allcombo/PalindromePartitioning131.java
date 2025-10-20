package org.laxman.striver.recursion.allcombo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePartitioning131 {
    public static void main(String[] args) {
        List<List<String>> res=new ArrayList<>();
        List<String> list=new ArrayList<>();
        String s="aabb";
        generate(s,0,res,list);
        System.out.println(res);


        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        nums.parallelStream().map(n->n%2).forEach(System.out::println);
    }
    static public void generate(String s, int pl, List<List<String>> res, List<String> list){
        if(pl==s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=pl;i<s.length();i++){
            if(isPalindrome(s,pl,i)){
                list.add(s.substring(pl,i+1));
                if(i!=s.length()-1) generate(s,pl+1,res,list);
                list.remove(list.size()-1);
            }
        }
    }

    static boolean isPalindrome(String s,int l, int r){
        while(l<=r){
            if(s.charAt(l++)!=s.charAt(r--))
                return false;
        }
        return true;
    }
}
