package org.laxman.striver.graph.learning;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        graph.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        graph.add(new ArrayList<>(Arrays.asList(0)));
        graph.add(new ArrayList<>(Arrays.asList(0, 4)));
        graph.add(new ArrayList<>(Arrays.asList(0)));
        graph.add(new ArrayList<>(Arrays.asList(2)));

        ArrayList<Integer> res = bfs(graph);
        System.out.println(res);
    }
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Integer> queue=new ArrayDeque<>();
        HashSet<Integer> set=new HashSet<>();
        set.add(0);
        queue.offer(0);
        while(queue.peek()!=null){
            Integer ele = queue.poll();
            ArrayList<Integer> nodes = adj.get(ele);
            res.add(ele);
            for(int i=0;i<nodes.size();i++){
                if(!set.contains(nodes.get(i))){
                    queue.offer(nodes.get(i));
                }
            }
        }
        return res;
    }
}
