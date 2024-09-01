package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;

public class MiddleOfLL {
    public static Node middleNodeLooping(Node head) {
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        temp=head;
        int mid=c/2;
        c=0;
        while(c!=mid){
            temp=temp.next;
            c++;
        }
        return temp;
    }

    public static Node middleNode(Node head) {
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }




}
