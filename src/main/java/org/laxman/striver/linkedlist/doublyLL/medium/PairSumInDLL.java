package org.laxman.striver.linkedlist.doublyLL.medium;

import org.laxman.striver.linkedlist.doublyLL.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.laxman.striver.linkedlist.doublyLL.DLLFunctions.arr2LL;
import static org.laxman.striver.linkedlist.doublyLL.DLLFunctions.printLL;

public class PairSumInDLL {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] numbers = {43, 44, 46, 47, 51, 55, 62, 69, 76, 77, 89, 90, 95};
        Node h=arr2LL(numbers);
        printLL(h);
        ArrayList<ArrayList<Integer>> res=findPairsWithGivenSum(98,h);
        System.out.println();
        for (ArrayList<Integer> innerList : res) {
            System.out.println(innerList);
        }
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Node t1=head,t2=head.next;
        while(t2!=null){
            if(t2.data+t1.data==target){
                res.add(new ArrayList<>(Arrays.asList(t1.data, t2.data)));
                t1=t1.next;
                t2=t1.next;

            } else if (t1.data+ t2.data>target) {
                t1=t1.next;
                t2=t1.next;
            }
            else {
                t2=t2.next;
            }
        }
        return res;
    }
}
