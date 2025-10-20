package org.laxman.striver.heaps;

import java.util.Arrays;

public class MaxHeap {
    public static void main(String[] args) {
        int[] arr={4, 10, 3, 5, 1, 2, 8, 7, 9, 6};
        int[] arr2={10, 9, 8, 7, 6, 2, 3, 5, 4, 1};
        //insertIntoHeap(arr2,11);//11, 10, 8, 7, 9, 2, 3, 4, 5, 1, 6
        //buildMaxHeap(arr,10);
        System.out.println(popRootMaxHeap(arr2));
        System.out.println(Arrays.toString(arr2));//10, 9, 8, 7, 6, 2, 3, 5, 4, 1
    }

    public static void buildMaxHeap(int[] arr,int n){
        for(int i=(n-2)/2;i>=0;i--){
            maxHeapifyDown(arr,i);
        }
    }

    public static int popRootMaxHeap(int[] arr){
        int poppedEle=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=0;
        maxHeapifyDown(arr,0);
        return poppedEle;
    }

    public static void maxHeapifyDown(int[] arr,int i){
        int largest=i,l=i*2+1,r=i*2+2;
        if(l<arr.length && arr[largest]<arr[l])
            largest=l;
        if(r<arr.length && arr[largest]<arr[r])
            largest=r;
        if(largest!=i){
            swap(arr,i,largest);
            maxHeapifyDown(arr,largest);
        }
    }

    public static void insertIntoHeap(int[] arr,int ele){
        arr[arr.length-1]=ele;//change to array list
        maxHeapifyUp(arr,arr.length-1);
    }

    public static void maxHeapifyUp(int[] arr,int i){
        while(i>=0 && arr[i]>arr[(i-1)/2]){
            swap(arr,i,(i-2)/2);
            i=(i-2)/2;
        }
    }

    public static void swap(int[] arr,int i1,int i2){
        int t= arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=t;
    }
}
