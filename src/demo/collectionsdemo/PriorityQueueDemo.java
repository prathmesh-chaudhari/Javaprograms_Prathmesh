//  17 May 2022
package demo.collectionsdemo;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Aman Dubey");
        pq.add("Rajat Pawar");
        pq.add("Anant Joshi");
        pq.add("Ashutosh Joshi");
        pq.add("Ranjeet Kale");
        pq.add("Shantsanu Patil");
        pq.add("Vivek Rana");

        System.out.println("Head: " + pq.element());
        System.out.println("Head: " + pq.peek());

        System.out.println("Iterating the queue elements");
        Iterator itr = pq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        pq.remove();
        pq.poll();

        System.out.println("After removing two elements.");

        Iterator itr1 = pq.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());

        }
    }
}
