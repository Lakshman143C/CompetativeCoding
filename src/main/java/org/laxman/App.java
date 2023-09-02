package org.laxman;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner in =new Scanner(System.in);
        System.out.println( "Enter a number" );
        double a=in.nextInt();

        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                isPrime=false;
                System.out.println(a+" is not a prime number");
                break;
            }
        }
        if (isPrime)
            System.out.println(a+" is a prime number");
    }
}
