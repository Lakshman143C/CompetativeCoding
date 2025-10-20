package org.laxman.striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {
    public static void main(String[] args) {
        List<String> res = generateParenthesis(3);
        System.out.println(res);
    }
    static public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        buildParanthesis(res,n,n,"");
        return res;
    }

    static public void buildParanthesis(List<String> res,int n,int m,String s){
        if(n==0 && m==0){
            res.add(s);
            return;
        }else if(n>m) return;
        if(n>0) buildParanthesis(res,n-1,m,s.concat("("));
        buildParanthesis(res,n,m-1,s.concat(")"));
    }
}
