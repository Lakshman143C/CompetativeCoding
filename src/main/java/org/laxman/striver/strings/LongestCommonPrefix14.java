package org.laxman.striver.strings;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] strs={"ab","a"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }
    static public String longestCommonPrefix(String[] strs) {
        int len=0;
        for(int i=0;i<strs[0].length();i++){
            if(isEqual(strs,strs[0].charAt(i),i)){
                len++;
            }else break;
        }
        return len>-1?strs[0].substring(0,len):"";
    }

    static public boolean isEqual(String[] strs,char ch,int ind){
        for(int i=1;i<strs.length;i++){
            if(ind<strs[i].length() && Character.compare(strs[i].charAt(ind),ch)!=0)
                return false;
        }
        return true;
    }
}
