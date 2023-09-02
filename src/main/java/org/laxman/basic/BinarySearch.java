package org.laxman.basic;
public class BinarySearch {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,};
        System.out.println(binarySearch(arr,7));
    }
    public static int binarySearch(int[] arr,int ele){
        int lb=0,ub=arr.length-1;
        while(lb<=ub){
            int m=(lb+ub)/2;
            if(arr[m]==ele){
                return m;
            } else if(arr[m]<ele){
                lb=m+1;
            }
            else
                ub=m-1;
        }
        return -1;
    }
}
