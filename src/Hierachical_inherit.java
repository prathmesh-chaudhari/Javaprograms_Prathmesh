// 13 - april - 22
// program for hierachical inherit

import java.io.*;
import java.util.*;


class Father_1 {
    
    void printFather_1 (){
        System.out.println("class Father is called");
    }
}

class Child_Two extends Father_1{
    
    void printtwo (){
        System.out.println("class two is called");
    }
}

class Child_Three extends Father_1{
    
    void printthree (){
        System.out.println("class three is called");
    }
}

class Child_Four extends Father_1{
    
    void printfour (){
        System.out.println("class four is called");
    }
}



public class Hierachical_inherit {
    public static void main(String args[]) {
        Child_Four f = new Child_Four();
        f.printfour();
       f.printFather_1();

        Child_Two t = new Child_Two();
        t.printtwo();
        t.printFather_1();
    }
}
