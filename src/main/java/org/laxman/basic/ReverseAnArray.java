package org.laxman.basic;
import java.util.Scanner;
public class ReverseAnArray {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter Size of the array");
        int array[]=new int[in.nextInt()];
        System.out.println("enter "+array.length+" values");
        for (int i=0;i<array.length;i++){
            array[i]=in.nextInt();
        }
        reverseArray(array);
        System.out.println("reversed array");
        for (int i :array ) {
            System.out.print(i+" ");
        }
    }
    static void reverseArray(int arr[]){
        //int lb=0,ub=arr.length;
        for(int lb=0,ub=arr.length-1;lb<ub;lb++,ub--){
            arr[lb]+=arr[ub];
            arr[ub]=arr[lb]-arr[ub];
            arr[lb]=arr[lb]-arr[ub];
        }
    }
}
