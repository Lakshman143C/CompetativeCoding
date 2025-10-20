package org.java.designpatterns.structural.decorator;

public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
