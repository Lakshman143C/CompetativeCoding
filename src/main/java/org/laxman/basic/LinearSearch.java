package org.laxman.basic;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter size of the array :");
        int arr[]=new int[in.nextInt()];
        System.out.println("Enter elements ");
        for (int i=0;i<arr.length;i++)
            arr[i]=in.nextInt();
        System.out.print("enter the number you want to search :");
        int ele=in.nextInt();
        for (int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                System.out.println("Element "+ele+" Found at index "+i);
                break;
            }
        }
    }
}
