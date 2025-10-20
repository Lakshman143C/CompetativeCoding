package org.java.designpatterns.structural.decorator;

public abstract class DecoratorPizza implements Pizza{
    protected Pizza pizza;

    public DecoratorPizza(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription();
    }

    @Override
    public double getCost() {
        return this.pizza.getCost();
    }
}
