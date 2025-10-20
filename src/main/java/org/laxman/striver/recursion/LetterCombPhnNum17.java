package org.laxman.striver.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombPhnNum17 {
    public static void main(String[] args) {
        String s="2";
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder("");
        generate(map,s,map.get(s.charAt(0)),res,sb,0);
        System.out.println(res);
    }
    public static void generate(Map<Character,String> map,String s,String str,List<String> res,StringBuilder sb,int ind){
       if(ind==s.length() || str==null){
           System.out.print(sb.toString());
           res.add(sb.toString());
           return;
       }
        for(int i=0;i<str.length();i++){
           sb.append(str.charAt(i));
           String string=(ind+1)<s.length()?map.get(s.charAt(ind+1)):null;
           generate(map,s,string,res,sb,ind+1);
           sb.deleteCharAt(sb.length()-1);
       }
    }

}
