package org.laxman.striver.recursion;

public class CountSubSequencesWithSumK {
    public static void main(String[] args) {
        int[] nums={1,2,1,1};
        System.out.println(countSubSequencesWithSumK(0,0,nums,3));
    }
    public static int countSubSequencesWithSumK(int ind,int sum,int arr[],int k){
        if(ind==arr.length){
            if(sum==k)
                return 1;
            else return 0;
        }
        sum+=arr[ind];
        int l=countSubSequencesWithSumK(ind+1,sum,arr,k);
        sum-=arr[ind];
        int r=countSubSequencesWithSumK(ind+1,sum,arr,k);
        return l+r;
    }
}
