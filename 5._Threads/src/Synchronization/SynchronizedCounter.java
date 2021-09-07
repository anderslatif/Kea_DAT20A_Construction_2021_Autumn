package Synchronization;

import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedCounter extends Thread {
    private static Object lockOne = new Object();
    private static Object lockTwo = new Object();
    // another way to create a lock
//    private ReentrantLock reentrantLock = new ReentrantLock();
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

/*  // todo solution 1

    public synchronized void decrement() {
        this.counter--;
    }

    public synchronized void increment() {
        this.counter++;
    }*/

    // todo solution 2

    public void decrement() {
        synchronized (lockOne) {
            this.counter--;
        }
    }

    public void increment() {
        synchronized (lockTwo) {
            this.counter++;
        }
    }
}

