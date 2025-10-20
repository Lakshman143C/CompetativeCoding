package org.laxman.striver.slidingwindow.variableLenWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongeSubStrWithoutRepeatingChar3 {
    public static void main(String[] args) {

    }
    public static  int lengthOfLongestSubstring(String s) {
        int maxLen=0,l=0,r=0;
        Map<Character,Integer> map=new HashMap<>();
        while(r<s.length()){
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r))>=l){
                l=map.get(s.charAt(r))+1;
            } map.put(s.charAt(r),r);

            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
