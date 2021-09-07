public class ThreadExtendsThread extends Thread {
    public void run() {
        for (;;) {
            // print the time
            System.out.println("------------------");
            System.out.println("| " + java.time.LocalTime.now() + " |");
            System.out.println("------------------");
            System.out.println();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // bonus do it once every second
        }
    }
}
