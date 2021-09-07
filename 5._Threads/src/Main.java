import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Runtime is the main thread in Java
        Runtime runtime = Runtime.getRuntime();

//        System.out.println(runtime.totalMemory());
//        System.out.println(runtime.freeMemory());
//        System.out.println(runtime.maxMemory());

/*        try {
            // for Windows people
            runtime.exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // extends Thread
        ThreadExtendsThread extendsThread = new ThreadExtendsThread();
        ThreadExtendsThread extendsThreadTwo = new ThreadExtendsThread();
        // start the thread
        // extendsThread.start();
        //extendsThreadTwo.start();

        // grouping threads together
        ThreadGroup threadGroup = new ThreadGroup("Name for my group");

        // implements Runnable
        ThreadImplementsRunnable runnableThread = new ThreadImplementsRunnable();
        Thread thread = new Thread(threadGroup, runnableThread);
        // thread.start();

        // System.out.println(thread.getThreadGroup().getName());

        PrintThreads thread0 = new PrintThreads("En lang saetning, en laengere saetning, en rigtig lang saetning");
        PrintThreads thread1 = new PrintThreads("11111111111111111111111111111111111111111111111111111111111111");
        PrintThreads thread2 = new PrintThreads("22222222222222222222222222222222222222222222222222222222222222");
        PrintThreads thread3 = new PrintThreads("Koerne spiser rigtig rigtig rigtig meget graes");

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
