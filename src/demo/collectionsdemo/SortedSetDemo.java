//  18 May 2022
package demo.collectionsdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {
        SortedSet<Integer> lhs = new TreeSet<>();
        lhs.add(10);
        lhs.add(5);
        lhs.add(0);
        lhs.add(1);
        lhs.add(0);
        lhs.add(56);
        //lhs.add(null);
        //lhs.add(null);

        System.out.println(lhs);
    }
}
