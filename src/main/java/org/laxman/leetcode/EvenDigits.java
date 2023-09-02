package org.laxman.leetcode;
public class EvenDigits {
    public static void main(String[] args){
        int arr[]={12,345,2,6,7896,33};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            int num=arr[i];
            int digits=0;
            while(num>0){   //optimized
                digits++;   // replace this while with
                num=num/10; // Math.log10(digits)
            }
            if(digits%2==0)
                count++;
        }
        return count;
    }
}
