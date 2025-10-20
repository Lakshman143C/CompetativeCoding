package org.laxman.striver.heaps;

import java.util.Arrays;

public class MinHeap {
    public static void main(String[] args) {
        int[] arr={ 4, 10, 3, 5, 1, 2, 8, 7, 9, 6}; // [1, 4, 2, 5, 6, 3, 8, 7, 9, 10]
        int[] arr2={1, 4, 2, 5, 6, 3, 8, 7, 9, 10};
        //buildMinHeap(arr,10);
        //insertIntoMinHeap(arr2,0);
        System.out.println(popRootMin(arr2));
        System.out.println(Arrays.toString(arr2));
    }

    public static int popRootMin(int[] arr){
        int poppedEle=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=0;
        heapifyMinDown(arr,0);
        return poppedEle;
    }

    public static void buildMinHeap(int[] arr,int n){
        for(int i=(n-2)/2;i>=0;i--){
            heapifyMinDown(arr,i);
        }
    }

    public static void heapifyMinDown(int[] arr, int i){
        int s=i,l=s*2+1,r=s*2+2;
        if(l<arr.length && arr[s]>arr[l])
            s=l;
        if(r<arr.length && arr[s]>arr[r])
            s=r;
        if(s!=i) {
            swap(arr,s,i);
            heapifyMinDown(arr, s);
        }
    }

    public static void insertIntoMinHeap(int[] arr,int ele){
        arr[arr.length-1]=ele;
        minHeapifyUp(arr,arr.length-1);
    }

    public static void minHeapifyUp(int[] arr,int i){
        while(i>=0 && arr[i]<arr[(i-1)/2]){
            swap(arr,i,(i-1)/2);
            i=(i-1)/2;
        }
    }

    public static void swap(int[] arr,int i1,int i2){
        int t= arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=t;
    }
}
