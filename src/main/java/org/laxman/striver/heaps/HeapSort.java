package org.laxman.striver.heaps;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr={4, 10, 3, 5, 1, 2, 8, 7, 9, 6};
        //maxHeapSort(arr);
        minHeapSort(arr);
    }
    public static void minHeapSort(int[] arr){
        MinHeap.buildMinHeap(arr,arr.length);
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1;i>0;i--){
            swap(arr,0,i);
            heapifyMinDown(arr,0,i);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void heapifyMinDown(int[] arr, int i,int heapSize){
        int s=i,l=s*2+1,r=s*2+2;
        if(l<heapSize && arr[s]>arr[l])
            s=l;
        if(r<heapSize && arr[s]>arr[r])
            s=r;
        if(s!=i) {
            swap(arr,s,i);
            heapifyMinDown(arr, s,heapSize);
        }
    }

    public static void maxHeapSort(int[] arr){
        MaxHeap.buildMaxHeap(arr,arr.length);
        System.out.print(Arrays.toString(arr));
        for(int i=arr.length-1;i>0;i--){
            swap(arr,0,i);
            maxHeapifyDown(arr,0, i);
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void maxHeapifyDown(int[] arr,int i,int heapSize){
        int largest=i,l=i*2+1,r=i*2+2;
        if(l<heapSize && arr[largest]<arr[l])
            largest=l;
        if(r<heapSize && arr[largest]<arr[r])
            largest=r;
        if(largest!=i){
            swap(arr,i,largest);
            maxHeapifyDown(arr,largest,heapSize);
        }
    }

    public static void swap(int[] arr,int i1,int i2){
        int t= arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=t;
    }
}
