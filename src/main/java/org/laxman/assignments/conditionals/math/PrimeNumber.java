package org.laxman.assignments.conditionals.math;
public class PrimeNumber {
    public static void main(String[] args){
        System.out.println(isPrime(11));
    }
    public static boolean isPrime(int num){
         boolean isPrime=true;
         for(int i=2;i<num/2;i++){
             if(num%i==0){
                 isPrime=false;
                 break;
             }
         }
         return  isPrime;
    }
}
