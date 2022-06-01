// 14 May 2022
package demo.threaad;

import java.util.logging.Level;
import java.util.logging.Logger;

class TrafficSignalDemo extends Thread {

    private String threadname;

    public TrafficSignalDemo(String name) {
        this.threadname = name;
    }

    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println(threadname);
            try {

                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

public class TrafficSignal {

    public static void main(String[] args) {
        TrafficSignalDemo green = new TrafficSignalDemo("Green");
        TrafficSignalDemo orange = new TrafficSignalDemo("Orange");
        TrafficSignalDemo red = new TrafficSignalDemo("Red");
        //TrafficSignalDemo orange_1 = new TrafficSignalDemo("__Orange__");

        green.setPriority(Thread.MAX_PRIORITY);
        orange.setPriority(Thread.NORM_PRIORITY);
        red.setPriority(Thread.MIN_PRIORITY);

        green.start();
        orange.start();
        red.start();
        //orange_1.start();
    }
}
