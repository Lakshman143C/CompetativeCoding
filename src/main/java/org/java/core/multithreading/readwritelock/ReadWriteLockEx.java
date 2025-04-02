package org.java.core.multithreading.readwritelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class BankAccount{
    private final ReentrantReadWriteLock rwlock=new ReentrantReadWriteLock();
    private final Lock readLock= rwlock.readLock();
    private final Lock writeLock= rwlock.writeLock();
    private double balance=0;
    public void deposite(double amount){
        rwlock.writeLock().lock();
        try {
            this.balance+=amount;
            System.out.println(Thread.currentThread().getName()+" Deposited "+amount);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        finally {
            rwlock.writeLock().unlock();
        }
    }

    public void fetchBalance(){
        rwlock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+" balance "+balance);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        finally {
            rwlock.readLock().unlock();
        }
    }
}

public class ReadWriteLockEx {
    public static void main(String[] args) throws InterruptedException {

        BankAccount account=new BankAccount();
        Thread write1=new Thread(()->
                account.deposite(100),"Thread-1");

        Thread write2=new Thread(()->account.deposite(200),"Thread-2");

        Thread read1=new Thread(account::fetchBalance,"Thread-2");
        Thread read2=new Thread(account::fetchBalance,"Thread-3");

        write1.start();
        write2.start();
        read1.start();
        read2.start();
    }
}
