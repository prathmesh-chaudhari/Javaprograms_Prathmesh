// 18 May 2022
package demo.collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Amol");
        hs.add("Amol");
        hs.add("Amit");
        hs.add("Radha");
        hs.add("Kunal");
        hs.add("kunal");
        hs.add("");
        hs.add("");
        hs.add("");

        System.out.println(hs.toString());
        Iterator itr = hs.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

        HashSet<String> hs1 = new HashSet<>();
        hs1.addAll(hs);
        hs1.add("");
        hs1.add("");
        hs1.add("45");
        hs1.add("423");
        hs1.add("56");

        System.out.println(hs1);

        boolean value = hs1.remove("45");
        System.out.println("is 3 removed? " + value);
        System.out.println(hs1);

        value = hs.removeAll(hs);
        System.out.println("is hs removed? " + value);
        System.out.println(hs1);
        System.out.println(hs);
    }
}
