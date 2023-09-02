package org.laxman.basic;
public class OrderAgnosticBS {
    public static void main(String[] args){
        int arr[]={1,2,3,5,7,8,22,32};
        int arr1[]={32,22,8,7,5,3,2,1};
        System.out.println("Ascending Order :"+orderAgnosticBS(arr,2));
        System.out.println("Descending Order :"+orderAgnosticBS(arr1,2));
    }
    static int orderAgnosticBS(int[] arr,int ele){
        int lb=0,ub=arr.length-1;
        if(arr[lb]<arr[ub]){
            while(lb<=ub){
               int m=lb+(ub-lb)/2;
               if(arr[m]>ele)
                   ub=m-1;
               else if(arr[m]<ele){
                   lb=m+1;
               }else {
                   return m;
               }
            }
        }
        else{
            while(lb<=ub){
                int m= lb+(ub-lb)/2;
                if(arr[m]>ele)
                    lb=m+1;
                else if(arr[m]<ele){
                    ub=m-1;
                }
                else
                    return m;
            }
        }
        return -1;
    }
}
