package org.laxman.striver.greedy.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval56 {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        merge(arr);
    }
    static public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a, b)->Integer.compare(a[0],b[0]));
        List<int[]> list=new ArrayList<>();
        int i=0;
        while(i<intervals.length-1){
            int ind=i;
            while(i<intervals.length-1 && intervals[ind][1]>=intervals[i+1][0]){
                intervals[ind][0]=Math.min(intervals[ind][0],intervals[i+1][0]);
                intervals[ind][1]=Math.max(intervals[ind][1],intervals[i+1][1]);
                i++;
            }
            list.add(intervals[ind]);
            i++;
        }
        return list.toArray(new int[0][]);
    }
}
