package demo.stringprogramsdemoo;

// import java.io.*;
// import java.lang.*;

public class Stringdemo {

    void displayString() {
        String s = "FUEL";
        System.out.print("String s = " + s);

        String str = new String(" Deogiri COE, A'bad");
        System.out.println(str);

        System.out.println(str.charAt(6));

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0){
                System.out.println("Char at " + i + " " + str.charAt(i));
            }
        }
    }


}
