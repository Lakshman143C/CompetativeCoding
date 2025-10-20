package org.laxman.striver.slidingwindow.constantWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegEleWithinWindow {
    public static void main(String[] args) {
        int[] arr={-8, 2, 3, -6, 10};
        firstNegInt(arr,2);
    }
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> list=new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<k;i++){
            if(arr[i]<0)
                q.add(i);
        }
        if(q.size()>0)
            list.add(arr[q.peek()]);
        else list.add(0);

        for(int i=k;i<arr.length;i++){
            while(!q.isEmpty() && q.peek()<=(i-k)){
                q.poll();
            }

            if(arr[i]<0)
                q.add(i);

            if(q.size()>0)
                list.add(arr[q.peek()]);
            else list.add(0);


        }
        return list;

    }
}
