package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;

import static org.laxman.striver.linkedlist.LinkedListFunctions.arr2LL;
import static org.laxman.striver.linkedlist.LinkedListFunctions.printLL;

public class Segregate012LL {
    public static void main(String[] args) {
        int[] arr={2,1,1,0,2,1,0,1,2,0};
        Node h=arr2LL(arr);
        printLL(h);
        Node head=segregate(h);
        printLL(head);
    }
    static Node segregate(Node head) {
        if(head==null || head.next==null) return head;
        Node zero=new Node(-1,null);
        Node one=new Node(-1,null);
        Node two=new Node(-1,null);
        Node t1=zero,t2=one,t3=two,temp=head;
        while(temp!=null){
            if(temp.data==0){
                t1.next=temp;
                t1=t1.next;
            }
            else if(temp.data==1){
                t2.next=temp;
                t2=t2.next;
            }
            else{
                t3.next=temp;
                t3=t3.next;
            }
            temp=temp.next;
        }

        t1.next=(one.next!=null)?one.next:two.next;
        t2.next=two.next;
        t3.next=null;
        return zero.next;
    }
}
