package org.laxman.striver.recursion;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println("Before reverse +"+s);
        reverse(s);
        System.out.println("After reverse +"+s);


    }
    static public void reverse(Stack<Integer> s){
        if (s.isEmpty()) return;
        int top=s.pop();
        reverse(s);
        pushToBottom(s,top);
    }
    static void pushToBottom(Stack<Integer> s,int ele){
        if(s.isEmpty()){
            s.push(ele);
            return;
        }
        int top=s.pop();
        pushToBottom(s,ele);
        s.push(top);
    }
}
