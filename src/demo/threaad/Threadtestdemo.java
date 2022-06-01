//  13 May 2022
package demo.threaad;

import java.lang.Thread;

class Runnabledemo implements Runnable {

    private Thread thread;
    private String threadname;

    public Runnabledemo(String name) {
        this.threadname = name;
        System.out.println("Creating Thread : " + threadname);
    }

    public void run() {

         System.out.println("Running Thread : " + threadname);
         
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Thread : " + threadname + ", " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadname + " INTERRUPTED.");
        }
        System.out.println("Thread " + threadname + " existing.");
    }

    public void start() {
        System.out.println("Starting " + threadname);
        if (thread == null) {
            thread = new Thread(this, threadname);
            thread.start();
        }

    }

}

public class Threadtestdemo {

    public static void main(String[] args) {
        Runnabledemo runnable = new Runnabledemo("Thread - 1");
        runnable.start();

        Runnabledemo runnable1 = new Runnabledemo("Thread - 2");
        runnable1.start();
    }
}
