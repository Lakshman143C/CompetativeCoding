package org.java.designpatterns.structural.decorator;

public class Olive extends DecoratorPizza{
    public Olive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Olive";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+0.75;
    }
}
