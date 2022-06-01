//  18 May 2022
package demo.concurrentpattern;

import java.util.concurrent.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class Task implements Runnable {

    public void run() {
        try {
            Long duration = (long) (Math.random() * 20);
            System.out.println("Running Task!");
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class NewSingleThreadExecutorDemo {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newSingleThreadExecutor();

        try {
            es.submit(new Task());
            System.out.println("Shutdown Executor..");
            es.shutdown();

            es.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("Task Interrupted..");
        } finally {
            if (!es.isTerminated()) {
                System.err.println("Cancel Non-finished Task...");
            }
        }
        es.shutdownNow();
        System.out.println("Shutdown is finished.");
    }
}


