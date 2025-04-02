package org.java.core.jvminternals;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JvmInternals {
    public static void main(String[] args) {

        student s1=new student();
        Class c1=s1.getClass();
        Field[] fields=c1.getDeclaredFields();
        Method[] methods=c1.getMethods();
        for(Field f:fields){
            System.out.println(f.getName());
        }
        for(Method m:methods){
            System.out.println(m.getName());
        }
    }
}
class student{
    private String name;
    private int roll_No;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getRoll_no() { return roll_No; }
    public void setRoll_no(int roll_no)
    {
        this.roll_No = roll_no;
    }
}
