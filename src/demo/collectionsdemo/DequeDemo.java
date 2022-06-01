//   17 May 2022
package demo.collectionsdemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque();

        dq.addFirst("First");
        dq.add("aaa");
        dq.add("bbb");
        dq.addLast("Last");
        dq.add("ccc");
        dq.add("ddd");
        dq.add("current added");
        dq.add("eee");
        dq.offer("offer");
        dq.offerFirst("1212");
        dq.offerLast("7909");

        for (String str : dq) {
            System.out.println(str);
        }
        System.out.println(dq);
    }
}
