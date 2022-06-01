//  19 May 2022
package demo.concurrentpattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CachedThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();

        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;

        System.out.println("Current Threads in Pool : " + pool.getPoolSize());

        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());

        System.out.println("Core Threads : " + pool.getCorePoolSize());
        System.out.println("Current Threads in Pool : " + pool.getPoolSize());

        executor.shutdown();
    }

    static class Task implements Runnable {

        public void run() {
            try {
                Long duration = (long) (Math.random() * 10);
                System.out.println("Running Task! Thread Name : " + Thread.currentThread()
                        .getName());
                TimeUnit.SECONDS.sleep(duration);
                System.out.println("Task Completed! Thread Name : " + Thread.currentThread()
                        .getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
