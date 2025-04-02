package org.java.core.multithreading.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class FairnessResource{
    private final Lock reentrantLock=new ReentrantLock(false);
    public void resource(){
        reentrantLock.lock();
        System.out.println(Thread.currentThread().getName() + " acquired the lock");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        finally {
            System.out.println(Thread.currentThread().getName()+" released the lock");
            reentrantLock.unlock();
        }
    }
}

public class Fairness {
    public static void main(String[] args) {
        FairnessResource resource=new FairnessResource();
        Runnable t=new Runnable() {
            @Override
            public void run() {
                resource.resource();
            }
        };

        Thread t1=new Thread(t,"Thread-1");
        Thread t2=new Thread(t,"Thread-2");
        Thread t3=new Thread(t,"Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
