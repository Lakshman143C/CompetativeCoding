package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;

import static org.laxman.striver.linkedlist.LinkedListFunctions.arr2LL;
import static org.laxman.striver.linkedlist.LinkedListFunctions.printLL;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        int[] a={1,3,5,7,9};
        int[] b={2,4,6,8,10};
        Node h1=arr2LL(a);
        Node h2=arr2LL(b);
        printLL(h1);
        printLL(h2);
        Node head = merge2SortedLL(h1, h2);
        printLL(head);
    }

    public static Node merge2SortedLL(Node head1,Node head2){
        Node dummyNode=new Node(-1,null);
        Node t1=head1,t2=head2,temp=dummyNode;
        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
                temp.next=t1;
                t1=t1.next;
            }
            else{
                temp.next=t2;
                t2=t2.next;
            }
            temp=temp.next;
        }

        if(t1!=null) temp.next=t1;
        if(t2!=null) temp.next=t2;
        return dummyNode.next;
    }
}
