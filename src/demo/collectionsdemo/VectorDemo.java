//  17 May 2022
package demo.collectionsdemo;

import java.util.Vector;
import java.util.Iterator;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("Amar");
        list.add("Ravi");
        list.add("Radha");
        list.add("Rajat");
        list.add("Shamish");
        list.add("Gopal");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
         Iterator itr1 = list.iterator();
        while (itr1.hasNext()) {
            System.out.println("After clearing");
            list.clear();
        }
    }
}
