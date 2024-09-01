package org.laxman;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App
{
    public static void main( String[] args )
    {
        String regex = "^\\d+(\\.\\d{2})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("123");

        // Check if the orderQuantity matches the regex pattern
        if (matcher.matches()) {
            // Valid format
            System.out.println("Order quantity is valid: " );
        } else {
            // Invalid format
            System.out.println("Order quantity should be in the format '123.45': " );
        }
        System.out.println((int)Double.parseDouble("342.00"));
    }
    public static void prime(){
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
