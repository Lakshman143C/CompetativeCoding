package org.laxman.striver.heaps.problems;

import java.util.*;

//link -> https://www.geeksforgeeks.org/problems/replace-elements-by-its-rank-in-the-array/0
public class ReplaceByRankGfG {
    public static void main(String[] args) {
        int[] arr={2 ,20 ,10 ,3 ,14, 16 ,14};
        int[] res = replaceWithRank2(arr, 7);
        System.out.println(Arrays.toString(res));
    }

    //solution using priority queue O(NLogN)
    static int[] replaceWithRank(int arr[], int N) {
        PriorityQueue<int[]> q=new PriorityQueue<>((a, b)->a[0]-b[0]);
        for(int i=0;i<arr.length;i++){
            int[] pair = new int[2];
            pair[0]=arr[i];
            pair[1]=i;
            q.add(pair);
        }
        int[] res=new int[N];
        int i=1,prev=-1;
        while(!q.isEmpty()){
            int[] pair=q.poll();
            if(prev>0 && prev!=pair[0]) {
                i++;
            }
            prev=pair[0];
            res[pair[1]]=i;
        }
        return res;
    }

    static int[] replaceWithRank2(int arr[], int N) {
        int[] sorted=arr.clone();
        Arrays.sort(sorted);
        int i=1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:sorted){
            if(!map.containsKey(num)) {
                map.put(num, i);
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            arr[j]=map.get(arr[j]);
        }
        return arr;
    }
}
