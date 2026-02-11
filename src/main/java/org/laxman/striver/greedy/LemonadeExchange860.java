package org.laxman.striver.greedy;

import java.util.HashMap;
import java.util.Map;

public class LemonadeExchange860 {
    public static void main(String[] args) {
        int[] bills={5,5,5,10,5,20,5,10,5,20};
        lemonadeChange(bills);
    }
    static public boolean lemonadeChange(int[] bills) {
        int amount=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<bills.length;i++){
            amount+=5;
            if(bills[i]>5){
                if(bills[i]==10 && !map.isEmpty() && map.containsKey(5) && map.get(5)!=0){
                    map.put(10,map.getOrDefault(10,0)+1);
                    map.put(5,map.get(5)-1);
                }else if(bills[i]==20 && !map.isEmpty() && map.containsKey(10) && map.containsKey(5) && map.get(10)>=1 && map.get(5)>=1){
                    map.put(20,map.getOrDefault(20,0)+1);
                    map.put(10,map.get(10)-1);
                    map.put(5,map.get(5)-1);
                }else if(bills[i]==20 && !map.isEmpty() && map.containsKey(5) &&  map.get(5)>=3){
                    map.put(20,map.getOrDefault(20,0)+1);
                    map.put(5,map.get(5)-3);
                }else return false;
            }else map.put(5,map.getOrDefault(5,0)+1);
        }
        return true;
    }
}
