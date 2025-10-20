package org.laxman.striver.slidingwindow.variableLenWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBasket904 {
    public static void main(String[] args) {
        int[] a={3,3,3,1,2,1,1,2,3,3,4};
        totalFruit(a);
    }
    static public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map=new HashMap<>();
        int l=0,r=0,len=0;
        while(r<fruits.length){
            if(map.containsKey(fruits[r])){
                map.put(fruits[r],map.get(fruits[r])+1);
            }else map.put(fruits[r],1);

            if(map.size()>2){
                int t=fruits[l];
                while(fruits[l]==t)
                    l++;
                map.remove(t);
            }
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }
}
