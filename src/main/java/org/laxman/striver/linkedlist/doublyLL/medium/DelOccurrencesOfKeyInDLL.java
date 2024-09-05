package org.laxman.striver.linkedlist.doublyLL.medium;

import org.laxman.striver.linkedlist.doublyLL.Node;

import static org.laxman.striver.linkedlist.doublyLL.DLLFunctions.arr2LL;
import static org.laxman.striver.linkedlist.doublyLL.DLLFunctions.printLL;

public class DelOccurrencesOfKeyInDLL {
    public static void main(String[] args) {
        int[] ar={2,2,10,8,4,2,5,2};
        Node h=arr2LL(ar);
        printLL(h);
        Node head=deleteAllOccurOfX(h,2);
        System.out.println();
        printLL(head);
    }
    static Node deleteAllOccurOfX(Node head, int x) {
        Node temp=head,prev=head,next=head;
        while(temp!=null){
            if(temp.data==x && temp.prev==null){
                head=head.next;
                head.prev=null;
                temp.next=null;
                temp=head;
            }
             else if(temp.data==x && temp.next!=null){
                prev=temp.prev;
                next=temp.next;
                prev.next=next;
                next.prev=prev;
                temp.prev=null;
                temp.next=null;
                temp=next;
            }else if (temp.data==x && temp.next==null) {
                prev = temp.prev;
                prev.next = null;
                break;
            }
            else temp=temp.next;
        }
        return head;
    }
}
