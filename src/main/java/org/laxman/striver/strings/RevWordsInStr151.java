package org.laxman.striver.strings;

public class RevWordsInStr151 {
    public static void main(String[] args) {
        String s="a good   example";
        reverseWords(s);
    }
    static public String reverseWords(String s) {
        s=s.trim();
        String[] strings=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=strings.length-1;i>=0;i--){
            sb.append(strings[i]);
            if(i!=0)
                sb.append(" ");
        }
        return sb.toString();
    }
}
