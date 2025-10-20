package org.java.designpatterns.structural.adapter;

public class PaypalApi {
    public void processPayment(double amount){
        System.out.println("payment processed final amount: "+amount);
    }
}
