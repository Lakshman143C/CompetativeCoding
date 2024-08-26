package org.laxman.striver.linkedlist.doublyLL;

public class DLLFunctions {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        Node head=arr2LL(arr);
        printLL(head);

        remoteGivenNode(head.next.next);
        System.out.println();printLL(head);
//        Node newhead=deleteHead(head);
//        System.out.println();
//        printLL(newhead);
//
//        Node head1=deleteTail(newhead);
//        System.out.println();
//        printLL(head1);
//
//        Node head2=removeKthPos(head1,7);
//        System.out.println();
//        printLL(head2);

    }
    //insertions
    //before
    public static Node insertBeforeHead(Node head,int data){
        Node newNode=new Node(data,null,head);
        head.prev=newNode;
        return newNode;
    }

    public static Node insertBeforeTail(Node head,int data){
        if(head.next==null)
            return insertBeforeHead(head,data);

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node node=new Node(10,temp.prev,temp);
        Node prev=temp.prev;
        prev.next=node;
        temp.prev=node;
        return head;
    }

    public static Node insertAtKthPos(Node head,int pos,int data){
        if(pos==1)
            return insertBeforeHead(head,data);

        Node temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            if(count==pos) break;
            temp=temp.next;
        }

        Node prev=temp.prev;
        Node next=temp.next;
        Node node=new Node(data,temp.prev,temp);
        prev.next=node;
        temp.prev=node;

        return head;
    }

    public static void insertBeforeNode(Node node,int data){
        Node newNode=new Node(data,node.prev,node);
        Node prev=node.prev;
        prev.next=newNode;
        node.prev=newNode;
    }

    //deletions
    public static void remoteGivenNode(Node node){
        Node prev=node.prev;
        Node next=node.next;
        if(next==null){
            prev.next=null;
            node.prev=null;
            return;
        }
        prev.next=next;
        next.prev=prev;
        node.prev=null;
        node.next=null;

    }

    public static Node removeKthPos(Node head,int pos){
        Node temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            if(count==pos) break;
            temp=temp.next;
        }

        Node prev=temp.prev;
        Node next=temp.next;

        if(prev==null && next==null) return null;
        else if (prev==null) {
            return deleteHead(head);
        } else if (next==null) {
            return deleteTail(head);
        }else{
            prev.next=next;
            next.prev=prev;
            temp.next=null;
            temp.prev=null;
        }

        return head;
    }

    public static Node deleteTail(Node head){
        if(head==null || head.next==null) return null;
        Node tail=head;
        while(tail.next!=null)
            tail=tail.next;

        Node temp=tail.prev;
        tail.prev=null;
        temp.next=null;

        return head;
    }

    public static Node deleteHead(Node head){
        if(head==null || head.next==null) return null;
        Node temp=head;
        head=head.next;
        head.prev=null;
        temp.next=null;
        temp=null;
        return head;
    }

    public static Node arr2LL(int[] arr){
        if(arr==null){
            System.out.println("array is null");
            return null;
        }
        Node head=new Node(arr[0],null,null);
        Node prev=head;

        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],prev,null);
            prev.next=temp;
            prev=temp;
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
    }
}
