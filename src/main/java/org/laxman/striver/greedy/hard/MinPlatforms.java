package org.laxman.striver.greedy.hard;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Arrays.*;

public class MinPlatforms {
    public static void main(String[] args) {
        int[] arr={2225, 1729, 1835, 951, 1143, 515, 1525, 743, 1025, 1611, 1827, 2203, 1116, 1514, 723};//{900, 940, 950, 1100, 1500, 1800};//{0, 930, 737, 2037, 1123, 929, 1719, 636, 1757, 1156, 813, 551, 112};
        int[] dep = {2231, 2003, 2149, 2252, 2352, 2153, 1625, 1049, 1337, 1639, 2151, 2330, 1633, 1611, 2009};//{910, 1200, 1120, 1130, 1900, 2000};//{1937, 2342, 1438, 2317, 2248, 1932, 2255, 1213, 2047, 1539, 1309, 2243, 1850};
        minPlatform2(arr,dep);
    }
    public static int minPlatform(int arr[], int dep[]) {
        PriorityQueue<int[]> q=new PriorityQueue<>((a, b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<arr.length;i++){
            q.add(new int[]{arr[i],dep[i]});
        }
        int maxPlatforms=Integer.MIN_VALUE;
        int[] platforms=new int[arr.length];
        while(!q.isEmpty()){
            int[] dwellTime=q.poll();
            for(int i=0;i<platforms.length;i++){
                if(platforms[i]<=dwellTime[0]){
                    platforms[i]=dwellTime[1];
                    maxPlatforms=Math.max(maxPlatforms,i);
                    break;
                }
            }
        }
        return maxPlatforms;
    }
    //optimized
    public static int minPlatform2(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int l=0,r=0,count=0,mp=Integer.MIN_VALUE;
        while(l<arr.length && r<dep.length){
            if(arr[l]<dep[r]){
                l++;
                count+=1;
            }else {
                r++;
                count-=1;
            }
            mp=Math.max(mp,count);
        }
        return mp;
    }
}
