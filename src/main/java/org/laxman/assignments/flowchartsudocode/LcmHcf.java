package org.laxman.assignments.flowchartsudocode;

public class LcmHcf {
    public static void main(String[] args){
        System.out.println("BruteForce approach :"+lcmBruteForce(4,5));
        System.out.println("LCM Euclidean :"+lcmEuclidean(4,5));

    }
    //Bruteforce approache to find LCM
    static int lcmBruteForce(int a,int b){
        int start=Math.max(a,b);
        while(true){
            if(start%a==0 && start%b==0)
                break;
            start++;
        }
        return start;
    }
    //lcm Eucliden

    /*
        lcm(a,b)*gcd(a,b)=a*b
       =>lcm(a,b)=a*b/gcd(a,b)
     */
    static int lcmEuclidean(int a,int b){
        return (a*b)/GCD.gcdEuclidean(a,b);

    }
}
