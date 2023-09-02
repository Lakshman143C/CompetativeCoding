package org.laxman.assignments.lecture2;
public class StringPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("laxal"));
    }
    static boolean isPalindrome(String s){
        boolean b=true;
        int lb=0,ub=s.length()-1;
        while(lb<=ub){
            if(s.charAt(lb)!=s.charAt(ub)){
                b=false;
                break;
            }
            lb++;
            ub--;
        }
        return b;
    }
}
