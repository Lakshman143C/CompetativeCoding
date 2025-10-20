package org.laxman.striver.strings;

import java.util.HashMap;

public class RomanToInt13 {
    public static void main(String[] args) {
        String s="III";
        romanToInt(s);
    }
    static public int romanToInt(String s) {
        int res=getIntValue(s.charAt(s.length()-1)),temp=0,prev=0;
        for(int i=s.length()-2;i>-1;i--){
            temp=getIntValue(s.charAt(i));
            if(temp<res && prev!=temp){
                res-=temp;
            }else res+=temp;
            prev=temp;
        }
        return res;
    }
    static public int getIntValue(char ch){
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }
}
