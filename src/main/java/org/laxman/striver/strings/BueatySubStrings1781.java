package org.laxman.striver.strings;

import java.util.HashMap;

public class BueatySubStrings1781 {
    public static void main(String[] args) {

    }
    public int beautySum1(String s) {
        int res = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            for (int j = 0; j < s.length() - i; j++) {  // bruteforce implemented by li.....
                res += getBeauty1(s, j, j + i);
            }
        }
        return res;
    }

    public int getBeauty1(String str, int l, int r) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, temp = 0;
        for (int i = l; i <= r; i++) {
            map.merge(str.charAt(i), 1, Integer::sum);
        }
        for (int freq : map.values()) {
            max = Math.max(max, freq);
            min = Math.min(min, freq);
        }
        return map.size() > 1 ? max - min : 0;
    }

    
}
