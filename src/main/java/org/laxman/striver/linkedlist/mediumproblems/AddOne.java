package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;

import static org.laxman.striver.linkedlist.LinkedListFunctions.arr2LL;
import static org.laxman.striver.linkedlist.LinkedListFunctions.printLL;

public class AddOne {
    public static void main(String[] args) {
        int[] arr={8,9,9};
        Node h=arr2LL(arr);
        printLL(h);
        Node h3=addOne(h);
        printLL(h3);

    }
    public static Node addOne(Node head) {
        int rem=addOneSol(head);
        if(rem>0){
            Node newHead=new Node(rem,head);
            return newHead;
        }
        return head;
    }
    static int addOneSol(Node head){
        if(head.next==null){
            int data=head.data;
            data++;
            head.data=data%10;
            return data/10;
        }
        int rem=addOneSol(head.next);
        int data=head.data;
        data+=rem;
        head.data=data%10;
        return data/10;
    }
}
