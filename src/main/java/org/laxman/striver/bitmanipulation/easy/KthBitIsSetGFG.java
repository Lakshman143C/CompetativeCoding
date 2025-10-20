package org.laxman.striver.bitmanipulation.easy;

public class KthBitIsSetGFG {
    public static void main(String[] args) {
        System.out.println(checkKthBit(13,3));
    }

    static boolean checkKthBit(int n, int k) {
        int t=n>>k;
        if(t%2==1) return true;
        return false;
    }
}
