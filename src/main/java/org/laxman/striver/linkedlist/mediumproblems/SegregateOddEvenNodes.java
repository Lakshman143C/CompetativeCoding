package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;

import static org.laxman.striver.linkedlist.LinkedListFunctions.arr2LL;
import static org.laxman.striver.linkedlist.LinkedListFunctions.printLL;

public class SegregateOddEvenNodes {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Node head=arr2LL(arr);
        printLL(head);
        Node h2=oddEvenList(head);
        printLL(h2);
    }

    public static Node oddEvenList(Node head) {
        if(head==null || head.next==null) return head;
        Node odd=head,even=head.next,evenHead=head.next;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;

            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
