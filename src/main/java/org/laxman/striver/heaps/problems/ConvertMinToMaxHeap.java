package org.laxman.striver.heaps.problems;

public class ConvertMinToMaxHeap {
    public static void main(String[] args) {

    }
    static void convertMinToMaxHeap(int N, int arr[]) {
        for(int i=(N-2)/2;i>=0;i--){
            sincDown(arr,i,N);
        }
    }

    public static void sincDown(int[] arr,int i,int n){
        int m=i;
        int l=i*2+1;
        int r=i*2+2;

        if(l<n && arr[l]>arr[m]) m=l;
        if(r<n && arr[r]>arr[m]) m=r;

        if(m!=i){
            swap(arr,i,m);
            sincDown(arr,m,n);
        }
    }

    public static void swap(int[] arr,int i1,int i2){
        int t=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=t;
    }
}
