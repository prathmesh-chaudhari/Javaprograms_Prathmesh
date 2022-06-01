// 18 - april - 2022    online session

//pop

import java.util.*;
import java.io.*;



public class Stackpopdemo {
    
    static void stackpush (Stack<Integer> s){
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
    }

    static void stackpop (Stack<Integer> s) {
        System.out.println("Pop Operation : " ) ;
        Integer a = s.pop();
        Integer b = s.pop();
        Integer c = s.pop();
        Integer d = s.pop();
        Integer e = s.pop();
        System.out.println(a + " " + b + " " + c + " " + d + " " + e );
    }
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer> ();
        stackpush(s);
        stackpop(s);

    }
}
