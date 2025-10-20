package org.laxman.striver.bitmanipulation.learn;

public class Lec1 {
    public static void main(String[] args) {
        String bin="0101";
        //conver2Dec(bin);
        System.out.println(convert2Dec(bin));
    }
    public static int conver2Dec(String bin){
        int res=0;
        for(int i=bin.length()-1;i>=0;i--){
            char ch=bin.charAt(i);
            if(ch=='1'){
                res+=1<<(bin.length()-1-i);
            }
        }
        return res;
    }

    public static int convert2Dec(String s){
        int p=1,res=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1')
                res+=p;
            p=p*2;
        }
        return res;
    }
}
