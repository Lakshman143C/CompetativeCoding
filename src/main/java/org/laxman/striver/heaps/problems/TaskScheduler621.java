package org.laxman.striver.heaps.problems;

import java.util.*;

public class TaskScheduler621 {
    public static void main(String[] args) {

    }
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<tasks.length;i++)
            freq.put(tasks[i],freq.getOrDefault(tasks[i],0)+1);

        int intervals=0;
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a, b)->b.getValue()-a.getValue());
        pq.addAll(freq.entrySet());

        while(!pq.isEmpty()){
            List<Map.Entry<Character,Integer>> tempList=new ArrayList<>();
            int cycle=n+1;
            while(cycle>0 && !pq.isEmpty()){
                Map.Entry<Character,Integer> entry=pq.poll();
                entry.setValue(entry.getValue()-1);
                if(entry.getValue()>0)
                    tempList.add(entry);
                intervals++;
                cycle--;
            }
            pq.addAll(tempList);
            if(pq.isEmpty())
                break;
            intervals+=cycle;
        }

        return intervals;
    }
}
