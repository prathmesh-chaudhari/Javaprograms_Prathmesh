//  19 May 2022
package demo.concurrentpattern;

import java.util.concurrent.*;
import java.util.*;
import java.io.*;

public class ScheduledExecutorServiceDemo1 {

    public static void main(String[] args) {    
        System.out.println("A Count Down Program");

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(20);

        System.out.println("Current Time : " + Calendar.getInstance()
                .get(Calendar.SECOND));

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

    @Override
    public void run() {
        System.out.println("Number " + num + " Current Time : "
                + Calendar.getInstance().get(Calendar.SECOND));
    }
}
