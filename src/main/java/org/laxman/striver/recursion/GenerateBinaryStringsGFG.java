package org.laxman.striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStringsGFG {
    private static List<String> res=new ArrayList<>();
    private static int len=0;
    public static void main(String[] args) {
        len=4;
        generateLeft(len,"");
        System.out.println(res);
    }

    public static List<String> generateBinaryStrings(int n) {

        return res;
    }
    public static void generateLeft(int n,String s){
        if(n==0){
            if(!s.contains("11") && len==s.length())
                res.add(s);
            return;
        }
        if(n>0)generateLeft(n-1,s.concat("0"));
        generateLeft(n-1,s.concat("1"));
    }

}
