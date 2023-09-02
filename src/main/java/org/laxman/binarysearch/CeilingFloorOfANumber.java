package org.laxman.binarysearch;
public class CeilingFloorOfANumber {
    public static void main(String[] args){
        int arr[]={2,3,5,9,14,16,18};
        System.out.println(getCeiling(arr,15));
        System.out.println(getFloor(arr,15));

    }
    static int getCeiling(int[] arr,int target){
        int lb=0,ub=arr.length;
        if(arr[arr.length-1]<target)
            return target;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(arr[mid]<target)
                lb=mid+1;
            else if(arr[mid]>target){
                ub=mid-1;
            }
            else
                return arr[mid];
        }
        return arr[lb];
    }
    static int getFloor(int[] arr,int target){
        int lb=0,ub=arr.length;
        if(arr[arr.length-1]<target)
            return target;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(arr[mid]<target)
                lb=mid+1;
            else if(arr[mid]>target){
                ub=mid-1;
            }
            else
                return arr[mid];
        }
        return arr[ub];
    }
}
