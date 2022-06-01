// 16 May 2022
package demo.collectionsdemo;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
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
    }
}
