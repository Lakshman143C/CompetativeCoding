package org.laxman.striver.bitmanipulation.easy;

public class SetBitGFG {
    public static void main(String[] args) {
        System.out.println(        clearIthBit(996,7));
    }
    static int setKthBit(int n, int k) {
        int t=1<<k;
        return t|n;
    }

    static int flipKthBit(int n,int k){
        int x=~(1<<k);
        return x&n;
    }

    static int clearIthBit(int n,int k){
        return n & ~(1<<k);
    }
}
