package org.java.core.multithreading.deadlocks;

public class DeadlocksEx {
    public static void main(String[] args) {
        Pen pen=new Pen();
        Paper paper=new Paper();
        Thread t1=new Thread(new Task1(pen,paper),"Thread-1");
        Thread t2=new Thread(new Task2(pen,paper),"Thread-2");
        t1.start();
        t2.start();
    }
}
class Pen{
    synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+" writing with pen and paper");
        paper.finishWriting();
    }
    synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finished writing with pen and paper");
    }
}
class Paper{
    synchronized void writeWithPenAndPaper(Pen pen){
        System.out.println(Thread.currentThread().getName()+" writing with pen and paper");
        pen.finishWriting();
    }
    synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finished writing with pen and paper");
    }
}

class Task1 implements Runnable{
    private Pen pen;
    private Paper paper;
    public Task1(Pen pen,Paper paper){
        this.pen=pen;
        this.paper=paper;
    }
    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper);
    }
}
class Task2 implements Runnable{
    private Pen pen;
    private Paper paper;
    public Task2(Pen pen,Paper paper){
        this.pen=pen;
        this.paper=paper;
    }
    @Override
    public void run() {
        synchronized (pen){                 // here we are trying to get the object of pen but initially
            paper.writeWithPenAndPaper(pen);//Task 1 took the lock so task 2 waits until task 1 completes the job
        }                                   // once the task one is done then task two will start
    }
}
