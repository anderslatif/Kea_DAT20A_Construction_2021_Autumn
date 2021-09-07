package Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample implements Runnable {
    Semaphore semaphore;

    public SemaphoreExample(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        for (int i = 0; i <= 100; i++) {
            if (i == 60) {
                semaphore.release();
            }
            System.out.println(i);
        }


    }
}
