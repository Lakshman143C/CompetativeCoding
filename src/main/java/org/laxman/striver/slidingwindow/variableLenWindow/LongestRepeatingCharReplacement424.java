package org.laxman.striver.slidingwindow.variableLenWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharReplacement424 {
    public static void main(String[] args) {
        String s="IMNJJTRMJEGMSOLSCCQICIHLQIOGBJAEHQOCRAJQMBIBATGLJDTBNCPIFRDLRIJHRABBJGQAOLIKRLHDRIGERENNMJSDSSMESSTR";
        int k=2;
        int res = characterReplacement(s, k);
        System.out.println(res);
    }
    static public int characterReplacement(String s, int k) {
        int maxLen = 0, maxFreq = 0, l = 0, r = 0, changes = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (r < s.length()) {
            if (map.get(s.charAt(r)) != null && map.containsKey(s.charAt(r)))
                map.replace(s.charAt(r), map.get(s.charAt(r)) + 1);
            else
                map.put(s.charAt(r), 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));
            changes = r - l + 1 - maxFreq;
            if (changes <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            } else {
                map.replace(s.charAt(l), map.get(s.charAt(l))- 1);
                if (map.get(s.charAt(l)) != null && map.get(s.charAt(l)) == 0)
                    map.remove(s.charAt(l));
                l++;
            }
            r++;
        }
        return maxLen;
    }

    //brute force approach
    static public int charReplacement(String s,int k){
        int max=0;
        for (int i=0;i<s.length();i++){
            int[] hsh=new int[26];
            int changes=0,maxFreq=0;
            for (int j=i;j<s.length();j++){
                hsh[s.charAt(j)-65]++;
                maxFreq=Math.max(maxFreq,hsh[s.charAt(j)-65]);
                changes=j-i+1-maxFreq;
                if(changes<=k)
                    max=Math.max(max,j-i+1);
                else break;
            }
        }
        return max;
    }
}
