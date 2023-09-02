package org.laxman.binarysearch;
public class SmalletLetrGtTarget {
    public static void main(String[] args){
        char[] letters={'c','f','j'};
        System.out.println(nextGreatestLetter(letters,'j'));
    }
    static public char nextGreatestLetter(char[] letters, char target) {
        int lb=0,ub=letters.length-1;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(letters[mid]>target)
                ub=mid-1;
            else
                lb=mid+1;
        }
        return letters[lb%letters.length];
    }
}
