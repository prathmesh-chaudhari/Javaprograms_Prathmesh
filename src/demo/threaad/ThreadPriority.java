// 14 May 2022
package demo.threaad;

public class ThreadPriority extends Thread {

    public void run() {

        System.out.println("run() method");
        String threadName = Thread.currentThread().getName();
        Integer threadPriority = Thread.currentThread().getPriority();
        System.out.println(threadName + " has priority " + threadPriority);
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
