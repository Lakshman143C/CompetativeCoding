package org.java.designpatterns.structural.adapter;

public class PaypalAdapter implements PaymentProcessor{

    private PaypalApi api=new PaypalApi();
    @Override
    public void processPayment(double amount) {
        api.processPayment(amount);
    }
}
