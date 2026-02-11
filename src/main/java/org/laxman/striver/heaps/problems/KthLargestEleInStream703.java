package org.laxman.striver.heaps.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestEleInStream703 {
    public static void main(String[] args) {
        int[] eles={4, 5, 8, 2};
        KthLargestEleInStream703 obj=new KthLargestEleInStream703(3,eles);
        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));



    }
    private PriorityQueue<Integer> q;
    private int n;
    public KthLargestEleInStream703(int k, int[] nums) {
        q=new PriorityQueue<>();
        for(int num :nums)
            q.add(num);
        this.n=k;
        while(q.size()>n)
            q.poll();
    }

    public int add(int val) {
        q.add(val);
        if(q.size()>n)
            q.poll();
        return q.peek();
    }
}
