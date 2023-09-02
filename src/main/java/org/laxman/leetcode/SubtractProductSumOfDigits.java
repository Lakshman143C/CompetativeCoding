package org.laxman.leetcode;
public class SubtractProductSumOfDigits {
    public static void main(String[] args){
        System.out.println(subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int n) {
        int productSum=1,digitSum=0;
        while(n>0){
            productSum=productSum*(n%10);
            digitSum+=(n%10);
            n=n/10;
        }
        return productSum-digitSum;
    }
}
