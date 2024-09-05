package org.laxman.striver.linkedlist.mediumproblems;

public class StudentChalk1894 {
    public static void main(String[] args) {
        int[] arr={3,4,1,2};
        int k=25;
        System.out.println(chalkReplacer(arr,k));
    }
    public static int chalkReplacer(int[] chalk, int k) {
        int sum=0;
        for(int i=0;i<chalk.length;i++){
            sum+=chalk[i];
        }
        int rem=k%sum;
        for(int i=0;i<chalk.length;i++){
            if((rem-chalk[i])<=0){
                k=i;
                break;
            }
            rem=rem-chalk[i];
        }
        return k;
    }
}
