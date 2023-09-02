package org.laxman.assignments.flowchartsudocode;
public class GCD {
    public static void main(String[] args){
        System.out.println("GCD BruteForce :"+gcdBruteForce(15,20));
        System.out.println("GCD Euclidean :"+gcdEuclidean(15,20));
    }
    static int gcdBruteForce(int a,int b){
        int result=Math.min(a,b);
            while(true){
                if(a%result==0 && b%result==0)
                    break;
                result--;
            }
        return result;
    }
    static int gcdEuclidean(int a,int b){
        while(b!=0){
            int temp=b;
            b=  a%b;
            a=temp;
        }
        return a;
    }
}
