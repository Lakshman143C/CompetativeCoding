package org.java.core.multithreading.producerconsumer;

class SharedResource{
    private int value;
    private boolean available=false;
    public synchronized void produce(int val){
        while(available){
            try {
                wait();
            }catch (InterruptedException e){
            }
        }
        value=val;
        available=true;
        System.out.println("produced val "+value);
        notify();
    }

    public synchronized void consume(){
        while(!available){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("consumed value");
        available=false;
        notify();
    }
}

class Producer implements Runnable{
    SharedResource resource;
    public Producer(SharedResource r){
        resource=r;
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            resource.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable{
    SharedResource resource;
    public Consumer(SharedResource r){
        resource=r;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            resource.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        Thread producer=new Thread(new Producer(resource),"Producer");
        Thread consumer=new Thread(new Consumer(resource),"consumer");
        producer.start();
        consumer.start();
    }
}
