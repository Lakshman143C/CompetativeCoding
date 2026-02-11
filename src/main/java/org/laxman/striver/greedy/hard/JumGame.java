package org.laxman.striver.greedy.hard;

public class JumGame {
    public static void main(String[] args) {
        int[] nums={7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        System.out.println(jumpGame2(nums,0,0));
    }
    public static boolean jumpGame(int nums[]){
        int dist=0;
        for(int i=0;i<nums.length;i++){
            if(i>dist) return false;
            dist=Math.max(dist,nums[i]+i);
        }
        return true;
    }
    public static int jumpGame2(int nums[],int ind,int jumps){
        if(ind>=nums.length-1) return jumps;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=nums[ind];i++){
            min=Math.min(min,jumpGame2(nums,ind+i,jumps+1));
        }
        return min;
    }
}
