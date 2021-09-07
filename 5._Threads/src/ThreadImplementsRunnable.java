public class ThreadImplementsRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread is running...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
