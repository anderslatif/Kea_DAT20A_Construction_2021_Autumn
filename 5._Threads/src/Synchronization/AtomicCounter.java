package Synchronization;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter extends Thread {
    private AtomicInteger counter = new AtomicInteger(0);

    public int getCounter() {
        return counter.get();
    }

    public void decrement() {
        this.counter.decrementAndGet();
    }

    public void increment() {
        this.counter.incrementAndGet();
    }
}

