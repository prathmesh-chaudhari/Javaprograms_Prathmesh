//  13 May 2022
package demo.threaad;

//import java.lang.Thread;
//public class Multi extends Thread{
//    public void run(){
//        System.out.println("Thread running.....");
//    }
//    public static void main(String[] args) {
//        Multi m1 = new Multi();
//        m1.start();
//    }
//   
//}   
public class Multi implements Runnable {

    public void run() {
        System.out.println("Thread is running.......");
    }

    public static void main(String[] args) {
        Multi m1 = new Multi();
        Thread t = new Thread(m1);
        t.start();
    }
}
