package org.laxman.striver.greedy.hard;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval57 {
    public static void main(String[] args) {
        int[][] intervals={{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] nInterval={4,8};
        insert(intervals,nInterval);
    }
    static public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> filteredList=new ArrayList<>();
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            filteredList.add(intervals[i]);
            i++;
        }


        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        filteredList.add(newInterval);

        while(i<intervals.length){
            filteredList.add(intervals[i]);
            i++;
        }
        return filteredList.toArray(new int[0][]);
    }
}
