package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;

public class CycleDetection2 {
    public static void main(String[] args) {

    }
    public static Node cycleDetection(Node head){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                System.gc();
                return slow;
            }
        }
        System.gc();
        return null;
    }
}
