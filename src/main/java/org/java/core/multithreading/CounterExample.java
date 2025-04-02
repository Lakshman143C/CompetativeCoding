package org.java.core.multithreading;

public class CounterExample {
    public static void main(String[] args) {
        Counter counter=new Counter(1);
        Thread t1=new Thread(new Operate(counter),"counter 1");
        Thread t2=new Thread(new Operate(counter),"counter 2");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
        }
        System.out.println(counter.getCount());
    }
}

class Counter{
    private int count;
    public Counter(int c){
        this.count=c;
    }
    synchronized public void increment(){
        count++;
    }
    synchronized public int getCount(){
        return count;
    }
}

class Operate implements Runnable{
    private Counter counter;
    public Operate(Counter c){
        this.counter=c;
    }
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            counter.increment();
        }
    }
}
