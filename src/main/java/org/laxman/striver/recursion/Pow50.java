package org.laxman.striver.recursion;

public class Pow50 {
    private static final long MOD=1_000_000_007;

    public static void main(String[] args) {
        long res=powerExponentiation(5,962);
        System.out.println(res);
    }

    static public double myPow(double x, int n) {
        if(x==1) return 1;
        double res=pow(x, Math.abs((long)n));
        return n<0?1/res:res;
    }

    static public double pow(double x,long n){
        if(n==0) return 1;
        if(n==1) return x%MOD;
        if(n%2==0) return pow(x*x,n/2)%MOD;
        return x*pow(x,n-1)%MOD;
    }

    static public long powerExponentiation(long x,long n){
        long ans = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                ans *= x;
                ans %= MOD;
                n -= 1;
            } else {
                x *= x;
                x%=MOD;
                n /= 2;
            }
        }
        return ans;
    }
}
