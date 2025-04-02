package org.laxman.interviewproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupStrBasedOnLengths {
    public static void main(String[] args) {
        String[] st={
                "dog","cat","elephant","fox","rabbit","giraffee","zebra"
        };
        groupStrings(st);
    }
    static void groupStrings(String[] s){
        Map<Integer, List<String>> res=new HashMap<>();
        for(int i=0;i<s.length;i++){
            if(res.containsKey(s[i].length())){
                res.get(s[i].length()).add(s[i]);
            }
            else {
                List<String> list=new ArrayList<>();
                list.add(s[i]);
                res.put(s[i].length(), list);
            }
        }
        System.out.println(res);
        System.out.println("done");
    }
}
