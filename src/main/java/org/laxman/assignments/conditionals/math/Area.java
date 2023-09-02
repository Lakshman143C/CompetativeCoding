package org.laxman.assignments.conditionals.math;

import java.util.Scanner;

public class Area {
    final static double PI=3.149;
    static Scanner in;
    public static void main(String[] args){
        in=new Scanner(System.in);
    }
    static double circle(double radius){
        return PI*(radius*radius);
    }
    static double rectangle(double length,double width){
        return length*width;
    }
    static  double square(double side){
        return side*side;
    }
    static double triangle(double base,double height){
        return 1/2*(base*height);
    }

}
