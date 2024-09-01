package org.laxman.striver.linkedlist.mediumproblems;

import org.laxman.striver.linkedlist.Node;

import java.util.Stack;

public class DetectCycleInLL {
    public static boolean hasCycle(Node head) {
        Stack<String> nodes=new Stack<>();
        Node temp=head;
        while(temp!=null){
            if(nodes.contains(temp.toString())){
                return true;
            }
            nodes.push(temp.toString());
            temp=temp.next;
        }
        return false;
    }
}
