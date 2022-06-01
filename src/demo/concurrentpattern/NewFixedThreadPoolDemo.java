//  19 May 2022
package demo.concurrentpattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class NewFixedThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exe = Executors.newFixedThreadPool(10);
        //cast the object to its class type
        ThreadPoolExecutor pool = (ThreadPoolExecutor) exe;
        //states before task execution

        System.out.println("Largest executions : " + pool.getLargestPoolSize());
        System.out.println("Maximum allowed threads : " + pool.getMaximumPoolSize());
        System.out.println("Current threads in pools : " + pool.getPoolSize());
        System.out.println("Currently executing threads : " + pool.getActiveCount());
        System.out.println("Total nuber of threads ever scheduled : " + pool.getTaskCount());
        System.out.println("");

        exe.submit(new Task());
        exe.submit(new Task());
        exe.submit(new Task());
        exe.submit(new Task());
        exe.submit(new Task());
        exe.submit(new Task());
        exe.submit(new Task());
        exe.submit(new Task());
        exe.submit(new Task());
        exe.submit(new Task());

        //states after the tasks execution
        System.out.println("Core Threads : " + pool.getCorePoolSize());
        System.out.println("Largest executions : " + pool.getLargestPoolSize());
        System.out.println("Maximum allowed threads : " + pool.getMaximumPoolSize());
        System.out.println("Current threads in pools : " + pool.getPoolSize());
        System.out.println("Currently executing threads : " + pool.getActiveCount());
        System.out.println("Total nuber of threads ever scheduled : " + pool.getTaskCount());

        exe.shutdown();

    }

    static class Task implements Runnable {

        public void run() {
            try {
                Long duration = (long) (Math.random() * 20);
                System.out.println("Running Task!  " + Thread.currentThread().getName());

                TimeUnit.SECONDS.sleep(duration);
                System.out.println("Completed Task!  " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
