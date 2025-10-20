package org.laxman.striver;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
       // String s="A man, a plan, a canal: Panama";
        //int[] nums={7,8,9,1,2,3,4,5,6};
//        int[] nums={-1,-1,1};
//        subarraySum(nums,0);
        int[]  a={2,0};
        int[] b={1};
        //merge(a,3,b,6);
        int n=7;
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i;k++)
                System.out.print(" ");
            for(int l=0;l<=i;l++) {
                System.out.print("*");
                if(l!=i)
                    System.out.print(" ");
            }
            for(int k=0;k<2*(n-i);k++)System.out.print(" ");

            for(int l=0;l<=i;l++) System.out.print("* ");


            System.out.println();
        }

    }

    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length<1)
            return;
        int j=0,k=0;
        int[] res=new int[nums1.length];
        for(int i=0;i<res.length;i++){
            if(nums1[j]!=0 && k<nums2.length && nums1[j]<nums2[k]){
                res[i]=nums1[j++];
            }
            else if(nums2.length>k){
                res[i]=nums2[k++];
            }
            else if(k>nums2.length && nums1[j]!=0)
                res[i]=nums1[j++];
        }
    }


    static public int subarraySum(int[] nums, int k) {
        if(nums.length==1 && nums[0]!=k) return 0;
        HashMap<Integer,Integer> prefixSum=new HashMap<>();
        int sum=0,count=0;
        prefixSum.put(sum,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(prefixSum.containsKey(sum)){
                prefixSum.put(sum,prefixSum.get(sum)+1);
            }
            else{
                prefixSum.put(sum,1);
            }
            if(prefixSum.containsKey(sum-k)){
                count+=prefixSum.get(sum-k);
            }
        }
        return count;
    }

    public static void insertionSort(int[] n){
        int ele,j;
        for(int i=1;i<n.length;i++){
            ele=n[i];
            j=i;
            while(j>=0 && n[j]>ele)
                n[j+1]=n[j--];
            if(i!=j)
                n[j]=ele;
        }
    }


    public static int findPivot(int[] nums){
        int l=0,r=nums.length-1,m=0;
        while(l<r){
            m=(l+r)/2;
            if(m>0 && nums[m]<nums[m-1])
                return m;
            else if(m<nums.length-1 && nums[m]>nums[m+1])
                return m+1;
            else if(nums[m]>nums[l])
                l=m;
            else r=m;
        }
        return 0;
    }

    static public boolean isPalindrome(String s) {
        int l=0, r=s.length()-1;
        while(l<r){
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))
                return false;
            l++;r--;
        }
        return true;
    }
}
