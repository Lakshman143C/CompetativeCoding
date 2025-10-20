package org.laxman.striver.recursion;

public class CountGoodNumbers1922 {
    public static void main(String[] args) {
        int n=50;
        countGoodNumbers(50);
    }


    //brute force for normal brains like you & me
    static public int countGoodNumbers(long n) {
        long[] range=getRange(n);
        int count=0;
        for(long i=range[0];i<range[1];i++){
            if(isGoodNumber(i,n)){
                count++;
            }
        }

        return count % 1000000007;
    }

    static public boolean isGoodNumber(long num,long n){
        long[] primes={0,0,1,1,0,1,0,1,0,0};
        long[] isEven={1,0,1,0,1,0,1,0,1,0};

        while(num>0){
            int temp=(int)num%10;
            num=num/10;
            if(n%2==0){
                if(isEven[temp]==0)
                    return false;
            }else{
                if(primes[temp]==0)
                    return false;
            }
            n--;
        }
        return true;
    }

    static public long[] getRange(long n){
        long begin=0,end=1;
        if(n>1){
            begin=1;
        }
        for(long i=1;i<n;i++){
            begin=begin*10;
            end=end*10;
        }
        end=end*10;
        return new long[]{begin,end};
    }
}
