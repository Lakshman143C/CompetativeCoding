package org.java.designpatterns.structural.decorator;

public class Cheese extends DecoratorPizza {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+0.75;
    }
}
