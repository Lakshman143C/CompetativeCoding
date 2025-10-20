package org.laxman.striver.strings;

public class StrToIntAtoi8 {
    public static void main(String[] args) {
        String s=" -042";
        myAtoi(s);
    }
    static public int myAtoi(String s) {
        int sign=1,index=0;
        long res=0;
        while(index<s.length() && s.charAt(index)==' ')
            index++;

        if(index<s.length() && s.charAt(index)=='-') {
            sign = -1;
            index++;
        }

        while(index<s.length() && Character.isDigit(s.charAt(index))){
            res=res*10+(s.charAt(index)-'0');
            if(res*sign>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(res*sign<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            index++;
        }
        return (int)(res*sign);
    }
}
