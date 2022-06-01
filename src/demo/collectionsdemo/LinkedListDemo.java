//  17 May 2022
package demo.collectionsdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("Mumbai");
        a1.add("Pune");
        a1.add("Aurangabad");
        a1.add("Nagpur");
        a1.add("Amravati");
        a1.add("Dhule");

        Iterator<String> itr = a1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        Iterator itr1 = a1.iterator();
        while (itr1.hasNext()) {
            System.out.println("After clearing");
            a1.clear();
        }
        
        
    }
}
