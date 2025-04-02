package org.laxman.leetcode75.array_string;

import java.util.ArrayList;
import java.util.List;

public class KidsGNC {
    public static void main(String[] args) {
        int[] ar={2,3,5,1,3};
        kidsWithCandies(ar,3);
    }
    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int ge=0;
        List<Boolean> res=new ArrayList<>();
        for(int i=0;i<candies.length;i++)
            ge=ge>=candies[i]?ge:candies[i];
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=ge)
                res.add(i,true);
            else res.add(i,false);
        }
        System.out.println(res);
        return res;
    }
}
