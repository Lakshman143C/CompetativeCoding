package org.laxman.leetcode75.array_string;

public class GCDStrings {
    public static void main(String[] args) {
        String s1="AA",s2="A";
        gcdOfStrings(s1,s2);
    }
    static public String gcdOfStrings(String str1, String str2) {
        int len=Math.max(str1.length(),str2.length());
        StringBuilder s=new StringBuilder();

        for(int i=0;i<len;i++){
            if(str1.charAt(i%str1.length())!=str2.charAt(i%str2.length()))
                return "";
            if(s.length()>1 && s.charAt(0)==str1.charAt(i)){
                if(evaluteStrings(str1,i,s))
                    return s.toString();
            }
            s.append(str1.charAt(i));
        }
        return s.toString();

    }

     static public boolean evaluteStrings(String s,int index,StringBuilder div){
        for(int i=0;i<index;i++){
            if(s.charAt(index+i)!=div.charAt(i))
                return false;
        }
        return true;
    }
}
