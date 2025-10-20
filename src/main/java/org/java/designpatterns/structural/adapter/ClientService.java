package org.java.designpatterns.structural.adapter;

public class ClientService {
    PaymentProcessor paymentProcessor=new PaypalAdapter();
    public void checkout(double amount){
        paymentProcessor.processPayment(amount);
    }
}
