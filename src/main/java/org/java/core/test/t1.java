package org.java.core.test;

public class t1 {
    public static void main(String[] args) {
        int[] nm={4,1,3,9,7};
        insertionSort(nm);
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
}
