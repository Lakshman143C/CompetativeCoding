package org.laxman.striver.strings;

import java.util.Stack;

public class RemoveOuterMostParanthesis1021 {
    public static void main(String[] args) {
        String s="(()())(())";
        removeOuterParentheses2(s);
    }
    public String removeOuterParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(stack.size()==1 && ch==')'){
                stack.pop();
            }else if(ch==')' && stack.size()>1 ){
                stack.pop();
                sb.append(ch);
            }else if(!stack.empty() && ch=='('){
                sb.append(ch);
                stack.push(ch);
            }else stack.push(ch);
        }
        return sb.toString();
    }
    static public String removeOuterParentheses2(String s) {
        int counter=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(counter==1 && ch==')'){
                counter--;
            }else if(ch==')' && counter>1 ){
                counter--;
                sb.append(ch);
            }else if(counter>=1 && ch=='('){
                sb.append(ch);
                counter++;
            }else counter++;
        }
        return sb.toString();
    }
}
