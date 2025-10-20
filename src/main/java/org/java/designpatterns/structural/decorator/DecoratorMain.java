package org.java.designpatterns.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Pizza pizz = new PlainPizza();
        pizz=new Cheese(pizz);
        pizz=new Olive(pizz);
        System.out.println(pizz.getCost());
        System.out.println(pizz.getDescription());
    }
}
