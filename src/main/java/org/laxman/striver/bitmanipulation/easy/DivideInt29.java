package org.laxman.striver.bitmanipulation.easy;

public class DivideInt29 {
    public static void main(String[] args) {
        int a=-2147483648,b=-1;
        System.out.println(divide(a,b));
    }
    static public int divide(int dividend, int divisor) {
        boolean sign=true;
        if(dividend==divisor) return 1;
        if(dividend<0 && divisor>0) sign=false;
        if(dividend>0 && divisor<0) sign=false;
        int n=Math.abs(dividend==Integer.MIN_VALUE?dividend-1:dividend),ans=0;
        int d=Math.abs(divisor);
        while(n>=d){
            int count=0;
            while(n>=d<<(count+1))
                count++;
            ans+=1<<count;
            n=n-(d<<count);
        }

        return sign?ans:-ans;
    }
}
