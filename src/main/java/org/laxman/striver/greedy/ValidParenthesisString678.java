package org.laxman.striver.greedy;

import java.util.Stack;

public class ValidParenthesisString678 {
    public static void main(String[] args) {
        String str="((***)";
        checkValidString(str);
    }
    static public boolean checkValidString(String s) {
        return fun(s,0,0);
    }
    static public boolean fun(String s,int i,int count){
        if(count<0) return false;
        if(i==s.length()) return count==0;
        if(s.charAt(i)=='(') return fun(s,i+1,++count);
        if(s.charAt(i)==')') return fun(s,i+1,--count);
        return  fun(s,i+1,++count) ||  fun(s,i+1,--count) ||  fun(s,i+1,count);
    }
}
