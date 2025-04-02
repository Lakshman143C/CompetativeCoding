package org.java.core.multithreading;

class MyThread implements Runnable{


    @Override
    public void run() {
        for(int i=0;i<5;i++){
            String s;
            for(int j=0;j<10000;j++)
                s=j+"";
            System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" "+i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Hello {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread=new MyThread();
        Thread t1=new Thread(thread,"min priority");
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2=new Thread(thread,"norm priority");
        t2.setPriority(Thread.NORM_PRIORITY);
        Thread t3=new Thread(thread,"max priority");
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("back to main thead");
    }
}
