package org.java.core.multithreading.threadcommunication;


class SharedResource{
    private boolean hasData=false;
    private int data=0;

    public synchronized void produceData(int i){
        while(hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        data=i;
        System.out.println(Thread.currentThread().getName()+" Produced Data "+i);
        hasData=true;
        notify();
    }

    public synchronized void consumeData(){
        while(!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName()+" Consumed data "+data);
        hasData=false;
        notify();
    }
}

class Producer implements Runnable{
    private SharedResource resource;
    public Producer(SharedResource r){
        this.resource=r;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            resource.produceData(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable{

    private SharedResource resource;
    public Consumer(SharedResource r){
        this.resource=r;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            resource.consumeData();
            try {
                Thread.sleep(2000);
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
        Thread consumer=new Thread(new Consumer(resource),"Consumer");
        producer.start();
        consumer.start();
    }
}
