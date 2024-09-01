package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;

import static org.laxman.striver.linkedlist.LinkedListFunctions.arr2LL;
import static org.laxman.striver.linkedlist.LinkedListFunctions.printLL;

public class DelMidNodeLL {
    public static void main(String[] args) {
        int[] arr={1};
        Node head=arr2LL(arr);
        printLL(head);
        deleteMiddle(head);
        printLL(head);
    }
    public static Node deleteMiddle(Node head) {
        if(head==null || head.next==null) return null;
        Node slow=head,fast=head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=slow.next;
        slow.next=slow.next.next;
        temp.next=null;
        return head;
    }
}
