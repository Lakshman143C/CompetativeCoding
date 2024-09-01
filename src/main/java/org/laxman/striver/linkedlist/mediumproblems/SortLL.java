package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;

import static org.laxman.striver.linkedlist.LinkedListFunctions.arr2LL;
import static org.laxman.striver.linkedlist.LinkedListFunctions.printLL;

public class SortLL {
    public static void main(String[] args) {
        int[] a={1,3,2,6,4,7,8,5,9};
        Node h=arr2LL(a);
        printLL(h);
        Node head=sortList(h);
        printLL(head);
    }
    public static Node sortList(Node head) {
        if(head==null || head.next==null) return head;
        Node mid=midLL(head);
        Node lh=head,rh=mid.next;
        mid.next=null;
        lh=sortList(lh);
        rh=sortList(rh);
        return merge2SortedLL(lh,rh);
    }

    public static Node midLL(Node head){
        Node slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
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
