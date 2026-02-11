package org.laxman.striver.greedy.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JobSequencingProblemGFG {
    public static void main(String[] args) {
        int[] deadline={4,1,1,1};//{4,5,6,6,4,2,2,2};//{2, 1, 2, 1, 1};
        int[] profit={20,10,40,30};//{20,60,70,65,25,80,10,22};//{100, 19, 27, 25, 15};
        jobSequencing(deadline,profit);
    }
    static public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int[][] merge=new int[deadline.length][3];
        int maxDays=0;
        for(int i=0;i<deadline.length;i++){
            merge[i][0]=i+1;
            merge[i][1]=deadline[i];
            merge[i][2]=profit[i];
            maxDays=Math.max(deadline[i],maxDays);
        }
        Arrays.sort(merge,(a,b)->Integer.compare(b[2],a[2]));
        int[] arr=new int[maxDays+1];
        int ans=0,count=0;
        for(int[] ar:merge){
            int i=ar[1];
            while(i>0 && arr[i]!=0){
                i--;
            }
            if(i>0){
                arr[i]=ar[0];
                ans+=ar[2];
                count++;
            }
        }
        return new ArrayList<>(Arrays.asList(ans,count));

    }
}
