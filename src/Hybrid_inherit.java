// 13 - april - 22
// program for hybrid inherit (combo of single, multi level, hierachical)

import java.io.*;

import java.util.*;

 
class One {
    
    void printone (){
        System.out.println("class Father is called");
    }
}

class Two extends One{
    
    void printtwo (){
        System.out.println("class two is called");
    }
}

class Three extends One {
    
    void printthree (){
        System.out.println("class three is called");
    }
}

class Four extends Two{
    
    void printfour (){
        System.out.println("class four is called");
    }
}



public class Hybrid_inherit {
    public static void main(String args[]) {
        Four f = new Four(); // object of multilevel, hierachical inherit
        f.printfour();
        f.printone();
        f.printtwo();

        Three t = new Three();  //object of single, hierachical inhrit
        t.printthree();
        t.printone();
    }
}
