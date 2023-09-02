package org.laxman.assignments.lecture2;
import java.util.ArrayList;
public class ArmstrongNumber {
    public static void main(String[] args){
        getArmstrongNumbers(120,140);
    }
    static ArrayList<Integer> getArmstrongNumbers(int start, int end){
        ArrayList<Integer> armstrongNums=new ArrayList<>();
        for(int i=start;i<=end;i++){
            int temp=i, sum=0;
            while(temp>0){
                int rem=temp%10;
                sum=sum*10+rem;
                temp=temp/10;
            }
            if(i==sum){
                armstrongNums.add(i);
                System.out.print(i+" ");
            }
        }
        return armstrongNums;
    }
}
