package org.laxman.striver.binarySearch;

public class ShipPackages1011 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        shipWithinDays(a,4);

    }
    static public int shipWithinDays(int[] weights, int days) {
        int l=0,r=0,m=0,res=0,temp=0;
        for(int i=0;i<weights.length;i++){
            r+=weights[i];
            l=Math.max(l,weights[i]);
        }
        while(l<=r){
            m=(l+r)>>1;
            temp=countDays(weights,m);
            if(temp<=days){
                res=m;
                r=m-1;
            }else l=m+1;
        }
        return res;
    }

    static public int countDays(int[] nums,int capacity){
        int weight=0,days=1;
        for(int i=0;i<nums.length;i++){
            if((weight+nums[i])>capacity){
                days++;
                weight=0;
            }
            weight+=nums[i];
        }
        return days;
    }
}
