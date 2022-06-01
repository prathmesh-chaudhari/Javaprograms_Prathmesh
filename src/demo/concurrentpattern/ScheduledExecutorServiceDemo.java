//  19 May 2022
package demo.concurrentpattern;

import java.util.concurrent.*;
import java.util.*;
import java.io.*;

public class ScheduledExecutorServiceDemo {

    public static void main(String[] args) {
        System.out.println("A count down program that continue from 10 to 0.");

        //Creating a scheduled executor service
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(20);

        // pRINTING THE CURRENT TIME
        System.out.println("Current time : " + Calendar.getInstance().get(Calendar.SECOND));

        //scheduling the tasks
        for (int i = 10; i > 0; i--) {
            scheduler.schedule(new Task(i), 10 - i, TimeUnit.SECONDS);

        }
        scheduler.shutdown();
    }
}

class Task implements Runnable {

    private final int num;

    public Task(int num) {
        this.num = num;

    }

    //@Override
    public void run() {
        System.out.println("Number " + "Current Time : " + Calendar.getInstance()
                .get(Calendar.SECOND));
    }
}
