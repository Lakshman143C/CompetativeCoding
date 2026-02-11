package org.laxman.striver.heaps;

import java.util.ArrayList;
import java.util.List;

public class MinHeapGfg {
    public static void main(String[] args) {
        MinHeapGfg obj=new MinHeapGfg();
        //obj.push(6);
        obj.push(2);
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.size());
        obj.push(3);
        System.out.println(obj.peek());
    }
    private List<Integer> heap;

    // Constructor
    public MinHeapGfg() {
        heap=new ArrayList<>();
    }



    public void push(int x) {
        heap.add(x);
        heapifyUp();
    }

    public void pop() {
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        heapifyDown(0);
    }

    public int peek() {
        // Return the top element or -1 if empty
        return !heap.isEmpty() ? heap.get(0): -1;
    }

    public int size() {
        // Return the number of elements in the heap
        return heap.size();
    }

    public void heapifyUp(){
        int i=heap.size()-1;
        while(i>0 && heap.get(i)<heap.get(parent(i))){
            swap(heap,i,parent(i));
            i=parent(i);
        }
    }

    public void heapifyDown(int i){
        int small=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<heap.size() && heap.get(left)<heap.get(small))
            small=left;

        if(right<heap.size() && heap.get(right)<heap.get(small))
            small=right;

        if(small!=i){
            swap(heap,small,i);
            heapifyDown(small);
        }
    }

    public static int parent(int i){
        return (i-1)/2;
    }

    public static void swap(List<Integer> heap,int i1,int i2){
        int t=heap.get(i1);
        heap.set(i1,heap.get(i2));
        heap.set(i2,t);
    }
}
