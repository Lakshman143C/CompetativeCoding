package org.laxman.striver.linkedlist;

public class LinkedListFunctions {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        Node head=arr2LL(arr);
        printLL(head);
    }
    public static Node arr2LL(int[] arr){
        Node head=new Node(arr[0],null);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node node=new Node(arr[i],null);
            prev.next=node;
            prev=node;

        }
        return head;
    }

    public static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null)
                System.out.print("->");
            temp=temp.next;
        }
        System.out.println();
    }
}
