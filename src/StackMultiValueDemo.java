//  20 - april - 2022

import java.io.*;
import java.util.*;


public class StackMultiValueDemo {
    public static void main(String[] args) {
        Stack stack1 = new Stack();

        Stack<String> stack2 = new Stack<String>();

        stack1.add(1);      // add is alternative for push
        stack1.add("Fuel");
        stack1.add(10.11f);
        stack1.add(" ");
        System.out.println(stack1);

        stack2.push("Devgiri COE");
        stack2.push("Aurangabad");
        stack2.push("Mumbai");
        System.out.println(stack2);

        stack1.pop();   System.out.println(stack1);     // pop deletes last in item 
        stack1.pop();   System.out.println(stack1);

        System.out.println(stack2.peek());  // returns last entered value
        System.out.println(stack2.peek());
        System.out.println(stack2);

        System.out.println(stack1.empty());  // checks if it is empty True or False

        System.out.println(stack2.search("Mumbai"));
        System.out.println(stack2.search("Aurangabad"));
        System.out.println(stack2.search("Devgiri"));
        System.out.println(stack2.search("Devgiri COE"));

        System.out.println(stack2.pop());   // pop prints popped value when in Sysout
    }
}
