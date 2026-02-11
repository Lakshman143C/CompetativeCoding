package org.laxman.striver.greedy;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins={10, 5, 2, 1};
        int am=18;
        System.out.println(coinChange(coins,am));
    }
    static int coinChange(int[] nums, int n) {
        int count = 0, amount = n;
        for (int c : nums) {
            while(amount>=c){
                amount-=c;
                count++;
            }
        }
        return count;
    }
}
