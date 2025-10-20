package org.laxman.striver.strings;

public class LongestSubStrInString5 {

    public static void main(String[] args) {
        String s="babad";
        longestPalindrome(s);
    }
    static public String longestPalindrome(String s) {
        if(s.length()==1)  return s;
        //String res="",temp="";
        int l=0,r=0;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i;j<s.length();j++){
                //temp=s.substring(i,j+1);
                if(isPalindrome(s,i,j+1)){
                    if((r-l)>((j+1)-i)){
                        l=i;
                        r=j+1;
                    }
                }
            }
        }
        return s.substring(l,r);
    }

    static public boolean isPalindrome(String str,int l,int r){
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r))
                return false;
            l++;r--;
        }
        return true;
    }
}
