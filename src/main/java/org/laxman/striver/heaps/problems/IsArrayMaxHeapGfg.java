package org.laxman.striver.heaps.problems;

public class IsArrayMaxHeapGfg {
    public static void main(String[] args) {

    }
    public boolean countSub(long arr[], long n) {
        return sincDown(arr,n,0);
    }

    public boolean sincDown(long[] arr,long n, int i){
        if(i>=n) return true;
        int l=i*2+1;
        int r=i*2+2;
        if(l<n && arr[l]>arr[i])
            return false;
        if(r<n && arr[r]>arr[i])
            return false;

        boolean b1=sincDown(arr,n,l);
        boolean b2=sincDown(arr,n,r);
        return b1 && b2;
    }
}
