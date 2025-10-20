package org.java.designpatterns.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        ClientService service=new ClientService();
        service.checkout(22.3);
    }
}
