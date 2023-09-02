package org.laxman.assignments.conditionals.math;
public class FactorialOfANumber {
    public static void main(String[] args){
        System.out.println(getFactorial(5));
    }
    static int getFactorial(int num){
        int factorial=1;
        for(int i=num;i>0;i--){
            factorial*=i;
        }
        return factorial;
    }
}
