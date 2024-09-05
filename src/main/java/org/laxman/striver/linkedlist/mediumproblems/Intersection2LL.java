package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;

public class Intersection2LL {
    public static void main(String[] args) {

    }
    static  Node getIntersectionNode(Node headA, Node headB) {
        Node t1=headA,t2=headB;
        int c1=0,c2=0;
        while(t1!=null || t2!=null){
            if(t1!=null) {
                c1++;
                t1=t1.next;
            }
            if(t2!=null) {
                c2++;
                t2=t2.next;
            }
        }
        return null;
    }
}
