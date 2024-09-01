package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ReverseLL {
    public Node reverseListStack(Node head) {
        Map<Node,Integer> count=new HashMap<>();
        Node temp=head;
        Stack<Integer> data=new Stack<>();
        while(temp!=null){
            data.push(temp.data);
            temp=temp.next;
        }

        temp=head;
        while(temp!=null){
            temp.data=data.pop();
            temp=temp.next;
        }
        return head;
    }

    public static Node reverseList(Node head){
        if(head==null || head.next==null)
            return head;
        Node newHead=reverseList(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
}
