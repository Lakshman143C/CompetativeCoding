package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;

import static org.laxman.striver.linkedlist.LinkedListFunctions.arr2LL;
import static org.laxman.striver.linkedlist.LinkedListFunctions.printLL;

public class AddTwoLL {
    public static void main(String[] args) {
        int[] a={5,5};
        int[] b={4,5,9,9};
        Node l1=arr2LL(a);
        Node l2=arr2LL(b);
        printLL(l1);
        printLL(l2);
        Node head=addTwoNumbers(l2,l1);
        printLL(head);

    }
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node t1=l1,t2=l2;
        int data=t1.data+t2.data;
        Node head=new Node(data%10,null);
        int carry=data/10;
        Node t3=head;
        t1=t1.next;t2=t2.next;
        while(t1!=null || t2!=null){
            if(t1!=null && t2!=null){
                data=t1.data+t2.data+carry;
                t1=t1.next;
                t2=t2.next;
            } else if (t1!=null && t2==null) {
                data= t1.data+carry;
                t1=t1.next;
            }else {
                data=t2.data+carry;
                t2=t2.next;
            }
            Node node=new Node(data%10,null);
            carry=data/10;
            t3.next=node;
            t3=node;
        }
        if(carry>0){
            Node node=new Node(carry,null);
            t3.next=node;
        }

        return head;
    }
}
