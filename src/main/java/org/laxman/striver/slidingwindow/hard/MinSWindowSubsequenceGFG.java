package org.laxman.striver.slidingwindow.hard;

public class MinSWindowSubsequenceGFG {
    public static void main(String[] args) {
        String s="abcdebdbcfbde";
        String s2="xyz";
        System.out.println(minWindow(s,s2));
    }
    public static String minWindow(String s1, String s2) {
        int start=0,end=Integer.MAX_VALUE;
        for(int i=0;i<s1.length();i++){
            int point=0;
            for(int j=i;j<s1.length();j++){
                if(s1.charAt(j)==s2.charAt(point)){
                    point++;
                }
                if(point==s2.length()){
                    if(end-start>j-i){
                        start=i;
                        end=j;
                    }
                    break;
                }
            }
        }
        return start!=-1 && end!=Integer.MAX_VALUE? s1.substring(start,end+1):"";

    }
}
