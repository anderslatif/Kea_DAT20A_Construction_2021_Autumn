package Deadlock;

import java.util.ArrayList;

public class DeadlockMain {

    public static void main(String[] args) {
        String lockOne = "I'm a lock";
        String lockTwo = "I'm a lock too";

                                        // anonymous class
        Thread threadOne = new Thread() {
            public void run() {
                synchronized (lockOne) {
                    System.out.println("Thread 1 is using lock one");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (lockTwo) {
                        System.out.println("Thread 1 is using lock two");
                    }
                }
            }
        };

        Thread threadTwo = new Thread() {
            public void run() {
                synchronized (lockTwo) {
                    System.out.println("Thread 2 is using lock two");

                    synchronized (lockOne) {
                        System.out.println("Thread 2 is using lock one");
                    }
                }
            }
        };

        threadOne.start();
        threadTwo.start();
    }
}
