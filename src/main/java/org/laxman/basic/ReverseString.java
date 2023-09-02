package org.laxman.basic;
public class ReverseString {
    public static void main(String[] args){
        System.out.println(reverse("laxman chintala"));
    }
    static String reverse(String s){
        StringBuilder reversedString=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
            reversedString.append(s.charAt(i));
        return reversedString.toString();
    }
}
