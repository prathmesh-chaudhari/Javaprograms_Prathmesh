// 18 - april - 2022    online session
//push
//peek

import java.util.*;
import java.io.*;



public class Online_session_prog {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String> ();
        s.push("Welcome");
        s.push("Fuel");
        s.push("Organisation");
        s.push(",");
        s.push(" Pune");

        System.out.println("Initial Stack is : " + s);
        System.out.println("The elemnt at the top of the stack is " + s.peek());// retrieve last enterd value and print it. i.e. Pune
    }
}
