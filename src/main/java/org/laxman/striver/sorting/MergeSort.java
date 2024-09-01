package org.laxman.striver.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={3,1,2,4,1,5,2,6,4};
        mergeSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(ele-> System.out.println(ele+" "));
    }

    public static void mergeSort(int[] arr,int low,int high){
        if(low==high) return ;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> res=new ArrayList<>();
        int left=low,right=mid+1;
        while(left<=mid && right<=high){

            if(arr[left]<=arr[right])
                res.add(arr[left++]);
            else
                res.add(arr[right++]);
        }

        while(left<=mid)
            res.add(arr[left++]);

        while(right<=high)
            res.add(arr[right++]);


        for (int j=low;j<=high;j++)
            arr[j]=res.get(j-low);
    }

    public static void merge2(int[] arr,int low,int mid,int high){
        int[] res=new int[arr.length];
        int left=low,right=mid+1,i=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right])
                res[i++]=arr[left++];
            else
                res[i++]=arr[right++];
        }

        while(left<=mid)
            res[i++]=arr[left++];

        while(right<=high)
            res[i++]=arr[right++];

        for (int j=low;j<=high;j++)
            arr[j]=res[j-low];

    }
}
