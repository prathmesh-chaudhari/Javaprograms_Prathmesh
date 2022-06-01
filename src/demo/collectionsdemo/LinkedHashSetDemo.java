//  18 May 2022
package demo.collectionsdemo;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(5);
        lhs.add(0);
        lhs.add(1);
        lhs.add(0);
        lhs.add(56);
        lhs.add(null);
        lhs.add(null);
        
        System.out.println(lhs);

    }
}
