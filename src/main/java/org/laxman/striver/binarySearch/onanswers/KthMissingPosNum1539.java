package org.laxman.striver.binarySearch.onanswers;

public class KthMissingPosNum1539 {
    public static void main(String[] args) {
        int[] n={2,3,4,7,11};
        findKthPositive(n,5);
    }
    static public int findKthPositive(int[] arr, int k) {
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=(l+r)>>1;
            if(arr[m]-(m+1)<k)
                l=m+1;
            else r=m-1;
        }
        return k-(arr[r]-(r+1))+arr[r];
    }
}
