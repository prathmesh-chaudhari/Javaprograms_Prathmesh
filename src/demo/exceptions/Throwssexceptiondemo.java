//  06 May 2022

package demo.exceptions;

import java.io.*;
import java.util.*;

class  ThrowssException {
        void testmethod(int num) throws IOException,ArithmeticException {
        if (num == 1){
            throw new IOException ("IOException occured.");
        }
        else {
            throw new ArithmeticException("Arithmetic Exception occured.");
        }
    }
}
public class Throwssexceptiondemo {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the value to check..");
            int num = s.nextInt();
            ThrowssException ts = new ThrowssException();
            ts.testmethod(num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
