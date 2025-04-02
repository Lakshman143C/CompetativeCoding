package org.laxman.striver.math;

public class Sum1ToNDiv {
    public static void main(String[] args) {
        System.out.println(sum1ToNDivisors(4));
    }
    public static int sum1ToNDivisors(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i*j==n){
                    sum+=i+j;
                    break;
                }
                else if(i*j>n){
                    sum+=i+j;
                    break;
                }
            }
        }
        return sum;
    }
}
