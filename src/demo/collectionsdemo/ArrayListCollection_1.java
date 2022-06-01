// 16 may 2022
package demo.collectionsdemo;

import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListCollection_1 {

    public static void main(String[] args) {
        ArrayList<Integer> ali = new ArrayList<>();

        for (int i = 1; i < 101; i++) {
            ali.add(i);
            // System.out.println(ali);
        }
        System.out.println(ali);

        for (int i = 0; i < ali.size(); i ++) {
            ali.remove(i);
           
        }

        System.out.println(ali);
    }
}
