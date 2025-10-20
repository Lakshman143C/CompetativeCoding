package org.laxman.striver.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortCharsByFrequency451 {
    public static void main(String[] args) {

    }
    public String frequencySort(String s) {
        int[] counts=new int[26];
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
            map.merge(s.charAt(i),1,Integer::sum);

        LinkedHashMap<Character,Integer> lmap=map.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e1,
                        LinkedHashMap::new
                ));
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character, Integer> entry : lmap.entrySet()){
            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return sb.toString();
    }
}
