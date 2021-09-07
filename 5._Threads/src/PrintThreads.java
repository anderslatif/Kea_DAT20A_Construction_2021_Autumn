public class PrintThreads extends Thread {
    private static Object lock = new Object();
    String message;

    public PrintThreads(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < message.length(); i++) {
                System.out.print(message.charAt(i));
            }
            System.out.println();
        }
    }
}
