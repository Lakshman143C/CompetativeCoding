package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;

import static org.laxman.striver.linkedlist.LinkedListFunctions.arr2LL;
import static org.laxman.striver.linkedlist.LinkedListFunctions.printLL;
import static org.laxman.striver.linkedlist.mediumproblems.PalindromeLL.reverseLL;

public class RemoveNthNode {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node head=arr2LL(arr);
        printLL(head);
        Node h3=removeNthFromEnd(head,2);
        printLL(h3);
    }
    public static Node removeNthFromEnd(Node head, int n) {
        if(head==null || head.next==null) return head;
        Node h2=reverseLL(head);
        if(n==1){
            Node temp=h2;
            h2=h2.next;
            temp.next=null;
            reverseLL(h2);
            return h2;
        }
        Node temp=h2;
        int c=1;
        while(c!=n-1){
            temp=temp.next;
            c++;
        }
        if(temp.next.next!=null){
            Node del=temp.next;
            temp.next=temp.next.next;
            del.next=null;
        }else{
            temp.next=null;
        }

        Node h3=reverseLL(h2);
        return h3;
    }
}
