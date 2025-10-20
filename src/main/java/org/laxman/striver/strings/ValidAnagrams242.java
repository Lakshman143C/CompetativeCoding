package org.laxman.striver.strings;

import java.util.HashMap;

public class ValidAnagrams242 {
    public static void main(String[] args) {

    }
    public boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] a=new int[26];
        for(char c:s.toCharArray()) a[c-'a']++;
        for(char c:t.toCharArray()) a[c-'a']--;

        for(int e:a){
            if(e!=0)
                return false;
        }
        return true;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> hash=new HashMap<>();
        HashMap<Character,Integer> hash2=new HashMap<>();
        int val=0;
        for(int i=0;i<s.length();i++){
            hash.merge(s.charAt(i),1,Integer::sum);
            hash2.merge(t.charAt(i),1,Integer::sum);
        }
        return hash.equals(hash2);
    }
}
