package demo.stringprogramsdemoo;

import java.io.*;
import java.util.concurrent.LinkedBlockingQueue;

public class StringBuilderdemo {

    void showStringBuilderdemo() {
        StringBuilder str = new StringBuilder();
        str.append("Fuel, Pune");
        System.out.println("String : " + str.toString());
        System.out.println(str.capacity());

        StringBuilder str1 = new StringBuilder("Welcome");
        str1.append(str);
        System.out.println("String1 = " + str1.toString());

        str1.insert(6, "Devgiri COE, Aurangabad");
        System.out.println("String1 : " + str1.toString());
        System.out.println();
        str1.replace(4, 13, "NAMASKAR");
        System.out.println("String1 : " + str1.toString());
        System.out.println();

        StringBuilder str2 = new StringBuilder(10);
        System.out.println("String2 capacity = " + str2.capacity());

        StringBuilder str3 = new StringBuilder(str1.toString());
        System.out.println("String3 = " + str3.toString());

        System.out.println(str3.deleteCharAt(0));

        System.out.println(str1.reverse());// enuP ,leuFemocleW

        System.out.println(str3.delete(0, 7));// Fuel, Pune

        str1.ensureCapacity(10);

    }
}
