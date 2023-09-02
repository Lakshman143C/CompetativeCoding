package org.laxman.assignments.flowchartsudocode;

import java.util.ArrayList;

public class FactorsOfNumber {
    public static void main(String[] args){
        ArrayList<Integer> factors=getFactors(28);
        for(Integer factor:factors)
            System.out.println(factor);
    }
    static ArrayList<Integer> getFactors(int num){
        ArrayList<Integer> factors=new ArrayList<>();
        for(int i=1;i<=(num/2);i++){
            if(num%i==0)
                factors.add(i);
        }
        return  factors;
    }
}
