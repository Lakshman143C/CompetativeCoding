package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;
import java.util.Stack;

import static org.laxman.striver.linkedlist.LinkedListFunctions.arr2LL;
import static org.laxman.striver.linkedlist.LinkedListFunctions.printLL;

public class PalindromeLL {
    public static void main(String[] args) {
        int[] arr={1,2,2,1};

        Node head=arr2LL(arr);
        printLL(head);
        System.out.println(isPalindrome(head));
        printLL(head);

    }
    public static boolean isPalindromeStack(Node head) {
        Stack<Integer> data=new Stack<>();
        Node temp=head;
        while(temp!=null){
            data.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.data!=data.pop()) return false;
            temp=temp.next;
        }
        return true;
    }

    public static boolean isPalindrome(Node head) {
        Node mid=middleNode2(head);
        Node newHead=reverseLL(mid.next);
        Node first=head,second=newHead;
        while(second!=null){
            if(first.data!=second.data){
                reverseLL(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverseLL(newHead);
        return true;
    }
    public static Node middleNode2(Node head) {
        Node slow=head,fast=head;
        while(fast.next!=null &&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node reverseLL(Node head){
        if(head==null || head.next==null) return head;
        Node newHead=reverseLL(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
}
