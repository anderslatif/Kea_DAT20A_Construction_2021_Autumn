import Concurrency.CountingThread;
import Semaphore.SemaphoreExample;

import java.util.concurrent.Semaphore;

public class MainTwo {

    public static void main(String[] args) throws Exception {
        CountingThread countingThread1 = new CountingThread();
        CountingThread countingThread2 = new CountingThread();
        CountingThread countingThread3 = new CountingThread();

        countingThread1.setPriority(Thread.MAX_PRIORITY);
        countingThread2.setPriority(Thread.MIN_PRIORITY);

        countingThread1.setName("One");
        countingThread2.setName("Two");
        countingThread3.setName("Three");

        countingThread1.start();
        countingThread1.join();

        countingThread2.start();
        // countingThread2.join();

        countingThread3.start();

        // to research: notify() notifyAll()


        // start the semaphore thread
//        Semaphore semaphore = new Semaphore(1);
//
//        SemaphoreExample semaphoreOne = new SemaphoreExample(semaphore);
//        SemaphoreExample semaphoreTwo = new SemaphoreExample(semaphore);
//
//        Thread semaphoreThreadOne = new Thread(semaphoreOne);
//        Thread semaphoreThreadTwo = new Thread(semaphoreTwo);
//
//        semaphoreThreadOne.start();
//        semaphoreThreadTwo.start();

        // thread 1: I want to use the resource
        // semaphore = 1 ... -> 0
        // semaphore released 0 -> 1

        // thread 2 I want to use the resource
        // semaphore = 0 ... -> wait until it is higher than 0
        // use the semaphore


    }

}
